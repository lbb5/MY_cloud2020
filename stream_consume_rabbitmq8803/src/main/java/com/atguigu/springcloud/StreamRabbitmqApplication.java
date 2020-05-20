package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author libingbing
 * @Date 2020-05-20 14:40
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbitmqApplication {
    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitmqApplication.class,args);
    }
}
