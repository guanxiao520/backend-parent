package com.mooc.meetingfilm.backend_show_consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.meetingfilm.backend_show_consumer.service
 * @date 2021/5/28 22:20
 */

@Service
public class ConsumerServiceImpl implements ConsumerServiceAPI {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient eurekaClient;

    @Override
    public String sayHello(String message) {

/*        String hostName = "localhost";
        int port = 7101;
        String uri = "/provider/sayHello?message=" + message;
        String url = "http://" + hostName + ":" + port + uri;
        String result = restTemplate.getForObject(url, String.class);*/
        ServiceInstance choose = eurekaClient.choose("hello-service-provider");
        String hostName = choose.getHost();
        int port = choose.getPort();
        String uri = "/provider/sayHello?message=" + message;
        String url = "http://" + hostName + ":" + port + uri;
        String result = restTemplate.getForObject(url, String.class);
        //invoke provider method 用的是HTTP请求方式
        return result;
    }
}