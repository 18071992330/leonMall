package org.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderMain {
    public static void main(String[] args) {
        System.out.println("Hello orderMain!");
        SpringApplication.run(OrderMain.class, args);
    }
}