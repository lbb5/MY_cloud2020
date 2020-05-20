package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author libingbing
 * @Date 2020-05-19 23:03
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApplication.class,args);
    }
}
