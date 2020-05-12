package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author libingbing
 * @Date 2020-05-10 17:05
 * @Description 启动类
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment8001Application {
    public static void main(String[] args) {SpringApplication.run(Payment8001Application.class);
    }
}
