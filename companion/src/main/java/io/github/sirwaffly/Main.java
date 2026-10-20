package io.github.sirwaffly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.awt.*;

@SpringBootApplication
@EnableScheduling
public class Main
{

    public static void main(String[] args) throws AWTException {

        System.setProperty("server.port", "47800");
        System.setProperty("spring.main.banner-mode", "off");
        System.setProperty("logging.level.root", "warn");
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(Main.class, args);

        new TrayIconManager().show();

    }

}
