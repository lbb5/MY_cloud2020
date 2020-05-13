package com.atguigu.springcloud.Service.impl;

import com.atguigu.springcloud.Service.PaymentService;
import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author libingbing
 * @Date 2020-05-11 21:49
 * @Description
 */
@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }



    @Override
    public Payment findById(Long id) {
        return paymentDao.findById(id);
    }
}
