package com.atguigu.springcloud.client;

import org.springframework.stereotype.Component;

/**
 * @Author libingbing
 * @Date 2020-05-19 11:38
 * @Description
 */
@Component
public class PaymentClientImpl implements PaymentClient {
    @Override
    public String ok(Integer id) {
        return "呀，失败了？";
    }

    @Override
    public String timeOut(Integer id) {
        return "他丫的有毒";
    }
}
