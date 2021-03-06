package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author libingbing
 * @Date 2020-05-20 16:20
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudPaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudPaymentApplication.class,args);
    }
}
