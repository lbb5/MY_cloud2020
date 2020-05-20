package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author libingbing
 * @Date 2020-05-20 14:22
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumeRabbitMqApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumeRabbitMqApplication.class, args);
    }
}
