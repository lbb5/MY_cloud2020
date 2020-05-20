package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.impl.MyMessageImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author libingbing
 * @Date 2020-05-20 9:45
 * @Description
 */
@RestController
public class MessageController {
    @Resource
    private MyMessageImpl message;

    @GetMapping("send")
    public String sendMessage() {
        message.send();
        return "发送成功";
    }
}
