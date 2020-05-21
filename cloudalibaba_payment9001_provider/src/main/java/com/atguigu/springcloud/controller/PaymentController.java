package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author libingbing
 * @Date 2020-05-20 16:28
 * @Description
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/get")
    public String hello(){
        return serverPort +"------> helloWorld";
    }

}
