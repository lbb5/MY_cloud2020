package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.util.UrlConst;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 黎兵兵
 * @Date: 2020-05-12 10 :14
 * @Description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/create")
    public CommonResult create(@RequestBody Payment payment) {
        return restTemplate.postForObject(UrlConst.PAYMENT_URL + "/cloud2020/payment/create", payment, CommonResult.class);
    }
    @GetMapping("/consumer/findById")
    public CommonResult findById(Long id) {
        return restTemplate.getForObject(UrlConst.PAYMENT_URL + "/cloud2020/payment/findById?id=" + id, CommonResult.class);
    }

}
