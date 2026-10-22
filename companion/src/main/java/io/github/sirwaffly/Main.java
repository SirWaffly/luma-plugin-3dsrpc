package io.github.sirwaffly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.awt.*;
import java.io.IOException;

@SpringBootApplication
@EnableScheduling
public class Main
{



    public static void main(String[] args) throws AWTException, IOException, InterruptedException {

        ConfigReader configReader = new ConfigReader();

        configReader.doesConfigExist();

        System.setProperty("server.port", String.valueOf(configReader.getPort()));
        System.setProperty("spring.main.banner-mode", "off");
        System.setProperty("logging.level.root", "warn");
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(Main.class, args);

        System.out.println("Started with port " + configReader.getPort());

        new TrayIconManager().show();

    }

}
