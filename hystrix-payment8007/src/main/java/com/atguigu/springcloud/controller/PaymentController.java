package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author libingbing
 * @Date 2020-05-19 10:06
 * @Description
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;
    @GetMapping("ok")
    public String ok(@RequestParam("id") Integer id){
        log.info("*******" + serverPort + " ok");
        return paymentService.ok(id);
    }
    @GetMapping("timeOut")
    public String timeOut(@RequestParam("id") Integer id){
        log.info("*******" + serverPort + " timeOut");
        return paymentService.timeOut(id);
    }



}
