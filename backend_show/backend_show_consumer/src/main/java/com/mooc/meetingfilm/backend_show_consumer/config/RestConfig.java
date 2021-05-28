package com.mooc.meetingfilm.backend_show_consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.meetingfilm.backend_show_consumer.config
 * @date 2021/5/28 22:24
 */

@Configuration
public class RestConfig {

    //注入bean容器当中,使其能够使用
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}