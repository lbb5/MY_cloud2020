package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 黎兵兵
 * @Date: 2020-05-13 10 :21
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulApplication.class);
    }
}
