package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author libingbing
 * @Date 2020-05-10 23:01
 * @Description
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment findById(@Param("id") Long id);
}
