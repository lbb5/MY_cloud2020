package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author libingbing
 * @Date 2020-05-20 16:13
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaPaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaPaymentApplication.class,args);
    }
}
