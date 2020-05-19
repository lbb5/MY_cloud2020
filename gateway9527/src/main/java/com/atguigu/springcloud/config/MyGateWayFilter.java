package com.atguigu.springcloud.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author libingbing
 * @Date 2020-05-19 20:53
 * @Description 自定义全局网关
 */
@Configuration
@Slf4j
@Component
public class MyGateWayFilter implements Ordered,GlobalFilter {


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.error("******---------------》 开始进入全局过滤器");
        String name = exchange.getRequest().getQueryParams().getFirst("name");
        if(name==null){
            log.error("&&&&&非法用户》》》》》》》》》》》");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
