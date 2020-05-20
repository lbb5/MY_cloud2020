package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Author libingbing
 * @Date 2020-05-20 14:30
 * @Description
 */
@Component
@EnableBinding(Sink.class)
public class RabbitMqConsumeController {
    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void getMessage(Message<String> message){
        String payload = message.getPayload();
        System.out.println(payload+"----------------->"+serverPort);
    }

}
