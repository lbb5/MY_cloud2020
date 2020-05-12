package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 黎兵兵
 * @Date: 2020-05-12 21 :34
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka2Application.class);
    }
}
