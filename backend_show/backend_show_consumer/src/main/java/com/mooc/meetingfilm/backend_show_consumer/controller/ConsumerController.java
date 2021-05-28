package com.mooc.meetingfilm.backend_show_consumer.controller;

import com.mooc.meetingfilm.backend_show_consumer.service.ConsumerServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.meetingfilm.backend_show_consumer.controller
 * @date 2021/5/28 22:22
 */

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerServiceAPI consumerServiceAPI;

    @RequestMapping(value = "/sayHello")
    public String sayHello(String message) {
        return consumerServiceAPI.sayHello(message);
    }
}