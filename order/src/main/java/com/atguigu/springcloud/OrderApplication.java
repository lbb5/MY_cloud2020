package com.atguigu.springcloud;

import com.lb.MyLoadBalance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 黎兵兵
 * @Auther: libingbing
 * @Date: 2020-05-12 10 :12
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "PAYMENTSERVICE",configuration = MyLoadBalance.class)
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);
    }
}
