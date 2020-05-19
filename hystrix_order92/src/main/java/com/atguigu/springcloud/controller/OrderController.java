package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.client.PaymentClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author libingbing
 * @Date 2020-05-19 11:45
 * @Description
 */
@RestController
public class OrderController {
    @Resource
    private PaymentClient paymentClient;

    @GetMapping("ok")
    String ok(@RequestParam("id") Integer id){
      return   paymentClient.ok(id);
    }


    @GetMapping("timeOut")
    String timeOut(@RequestParam("id") Integer id){
      return   paymentClient.timeOut(id);
    }
}
