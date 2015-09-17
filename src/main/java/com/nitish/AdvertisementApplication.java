package com.nitish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class AdvertisementApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "advertisement-server");
        SpringApplication.run(AdvertisementApplication.class, args);
    }
}
