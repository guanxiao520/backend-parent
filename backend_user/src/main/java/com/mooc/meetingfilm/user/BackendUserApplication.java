package com.mooc.meetingfilm.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.mooc.meetingfilm.user.dao.mapper"})
//由于我们需要扫描util模块的项目,所以需要引入
@ComponentScan(basePackages = "com.mooc.meetingfilm")
public class BackendUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendUserApplication.class, args);
    }

}
