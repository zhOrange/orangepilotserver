package com.orange.orangepilotserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class OrangepilotserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrangepilotserverApplication.class, args);
    }
}
