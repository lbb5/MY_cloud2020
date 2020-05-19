package com.atguigu.springcloud.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author libingbing
 * @Date 2020-05-19 11:35
 * @Description
 */
@Component
@FeignClient(value = "HystrixPaymentService", fallback = PaymentClientImpl.class)
public interface PaymentClient {

    @GetMapping("ok")
    String ok(@RequestParam("id") Integer id);


    @GetMapping("timeOut")
    String timeOut(@RequestParam("id") Integer id);


}
