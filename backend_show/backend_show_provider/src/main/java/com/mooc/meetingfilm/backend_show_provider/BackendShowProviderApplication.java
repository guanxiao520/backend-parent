package com.mooc.meetingfilm.backend_show_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient //我们一般使用discoveryClient,eurekaClient一般只作用于eureka,还有其他注册中心zookeeper,redis等,如果要集成,可以不修改
@SpringBootApplication
public class BackendShowProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendShowProviderApplication.class, args);
    }

}
