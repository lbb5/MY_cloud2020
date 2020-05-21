package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author libingbing
 * @Date 2020-05-20 19:12
 * @Description
 */
@RestController
public class OrderNacosController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public String get(){
        return restTemplate.getForObject("http://nacos-payment-provider/get",String.class);
    }

}
