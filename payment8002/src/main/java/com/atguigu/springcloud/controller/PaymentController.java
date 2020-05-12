package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.Service.PaymentService;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author libingbing
 * @Date 2020-05-11 21:50
 * @Description
 */
@RestController
@Slf4j
@RequestMapping("/cloud2020/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {

        int i = paymentService.create(payment);
        if (i > 0) {
            return new CommonResult(200, "插入成功");
        }
        return new CommonResult(400, "插入失败");
    }

    @GetMapping("/findById")
    public CommonResult<Payment> findById( Long id) {
        Log log = LogFactory.getLog(PaymentController.class);
        log.info("payment:"+paymentService.findById(id));
        return new CommonResult(200, "查询成功", paymentService.findById(id));
    }
}
