package com.management.poolmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//TODO Remove exclusion of SecurityAutoConfiguration, only for development
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class PoolManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoolManagementApplication.class, args);
    }

}
