package com.mooc.meetingfilm.backend_show_provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.meetingfilm.backend_show_provider.controller
 * @date 2021/5/28 22:13
 */

@RestController
@Slf4j
public class ProviderController {

    //el表达式获取环境变量
    @Value("${server.port}")
    private int port;

    @RequestMapping(value = "/provider/sayHello")
    public String providerSayHello(String message) {
        log.error("provider sayhello port:{},message:{}", port, message);
        return "Provider sayHello port:" + port + ",message:" + message;
    }
}