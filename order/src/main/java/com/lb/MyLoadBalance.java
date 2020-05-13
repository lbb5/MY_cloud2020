package com.lb;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 黎兵兵
 * @Date: 2020-05-13 11 :57
 * @Description:
 */
@Configuration
public class MyLoadBalance {
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
