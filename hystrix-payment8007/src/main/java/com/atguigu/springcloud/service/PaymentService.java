package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @Author libingbing
 * @Date 2020-05-19 10:06
 * @Description
 */
@Service
public class PaymentService {

    public String ok(Integer id){
        return Thread.currentThread().getName()+ "哈哈" + "id = "+ id;
    }

    public String timeOut(Integer id){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName() + " 用时 3s id = " + id ;
    }
}
