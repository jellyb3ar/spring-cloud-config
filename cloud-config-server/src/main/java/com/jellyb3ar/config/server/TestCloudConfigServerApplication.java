package com.jellyb3ar.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TestCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCloudConfigServerApplication.class, args);
    }

}
