package io.github.sirwaffly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

@SpringBootApplication
@EnableScheduling
public class Main
{



    public static void main(String[] args) throws AWTException, IOException, InterruptedException {

        ConfigReader configReader = new ConfigReader();

        configReader.doesConfigExist();

        if(configReader.isUpdateEnabled())
        {
            try
            {

                URL url = URI.create("https://raw.githubusercontent.com/SirWaffly/luma-plugin-3dsrpc/main/companion/database.json").toURL();
                InputStream input = url.openStream();
                byte[] downloadedFile = input.readAllBytes();

                input.close();

                // Overwrite the local database.json with the downloaded one
                Files.write(Path.of("database.json"), downloadedFile);

                System.out.println("Database updated from GitHub");

            }
            catch (IOException e)
            {

                System.out.println("Could not update the database!");

            }
        }

        try
        {

            Database.load();
            System.out.println("Database loaded successfully!");

        } catch (IOException e)
        {

            System.out.println("There was an error loading the database.");

        }

        System.setProperty("server.port", String.valueOf(configReader.getPort()));
        System.setProperty("spring.main.banner-mode", "off");
        System.setProperty("logging.level.root", "warn");
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(Main.class, args);

        System.out.println("Started with port " + configReader.getPort());

        new TrayIconManager().show();

    }

}
