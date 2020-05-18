package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.service.PaymentClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author libingbing
 * @Date 2020-05-18 10:30
 * @Description
 */
@RestController
@RequestMapping("/consumer/openFeign")
public class OpenFeignController {
    @Resource
    private PaymentClient paymentClient;

    @GetMapping("/getById")
    public CommonResult getById(Long id){
        return paymentClient.findById(id);
    }

    @GetMapping("/timeOut")
    public String timeOut(){
        return paymentClient.timeOut();
    }
}
