package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author libingbing
 * @Date 2020-05-19 23:24
 * @Description RefreshScope 动态刷新，记得在yml中配置好暴露的端点
 */

@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${log.info}")
    private String logInfo;
    @GetMapping("get")
    public String get(){
        return logInfo;
    }
}
