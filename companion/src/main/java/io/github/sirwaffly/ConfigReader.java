package io.github.sirwaffly;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.*;

public class ConfigReader {

    Gson gson = new Gson();
    Path configPath = Path.of("config.json");

    public void doesConfigExist() throws IOException, InterruptedException {

        if(!Files.exists(configPath))
        {

            //We let the user know that the file is missing and we proceed to create a new one
            System.out.println("Config file is corrupted or removed, creating a new one...");
            File configFile = new File("config.json");
            configFile.createNewFile();

            // We edit the file with gson to insert the relevant fields
            ConfigData config = new ConfigData();

            config.port = 47800;
            config.updateOnStartup = true;

            FileWriter writer = new FileWriter("config.json");

            gson.toJson(config, writer);

            writer.close();

            // Punish user for non-existing file;
            // Thread.sleep(999999999);

        }

    }

    public void setPort(int port) throws IOException
    {

        // We read the data from the file, save it onto a ConfigData class, change it, and write the file again
        FileReader reader = new FileReader("config.json");

        ConfigData config = gson.fromJson(reader, ConfigData.class);

        reader.close();

        config.port = port;

        FileWriter writer = new FileWriter("config.json");

        gson.toJson(config, writer);

        writer.close();

        System.out.println("Successfully updated port to " + port);

    }

    public int getPort() throws IOException {

        // We read the file and return the port
        FileReader reader = new FileReader("config.json");

        ConfigData config = gson.fromJson(reader, ConfigData.class);

        reader.close();

        return config.port;
    }

}