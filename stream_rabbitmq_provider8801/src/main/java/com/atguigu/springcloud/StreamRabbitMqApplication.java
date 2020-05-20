package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author libingbing
 * @Date 2020-05-20 9:23
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbitMqApplication {
    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitMqApplication.class,args);
    }
}
