package io.github.sirwaffly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Main
{

    public static void main(String[] args)
    {

        System.setProperty("server.port", "47800");
        SpringApplication.run(Main.class, args);

    }

}
