package org.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMainB {
    public static void main(String[] args) {
        System.out.println("Hello Eureka02!");
        SpringApplication.run(EurekaMainB.class, args);
    }
}