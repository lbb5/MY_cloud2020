package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author libingbing
 * @Date 2020-05-18 10:05
 * @Description
 */
@Component
@FeignClient(value = "paymentService")
public interface PaymentClient {

    @GetMapping("/cloud2020/payment/findById")
    CommonResult<Payment> findById(@RequestParam("id") Long id);
    @GetMapping("/cloud2020/payment/timeOut")
     String timeOut();
}
