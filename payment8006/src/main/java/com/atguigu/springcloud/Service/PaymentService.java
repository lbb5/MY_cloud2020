package com.atguigu.springcloud.Service;


import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @Author libingbing
 * @Date 2020-05-11 21:48
 * @Description
 */
@Service
public interface PaymentService {
    int create(Payment payment);

   Payment findById(@Param("id") Long id);
}
