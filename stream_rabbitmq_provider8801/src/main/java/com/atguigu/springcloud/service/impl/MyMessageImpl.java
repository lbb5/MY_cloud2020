package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Author libingbing
 * @Date 2020-05-20 9:34
 * @Description stream
 */
@EnableBinding(Source.class)
@Slf4j
public class MyMessageImpl implements Message {
    @Resource
    private MessageChannel output;

    @Override
    public void send() {
        String uuid = UUID.randomUUID().toString();
        log.error(uuid);
        output.send(MessageBuilder.withPayload(uuid).build());
    }
}
