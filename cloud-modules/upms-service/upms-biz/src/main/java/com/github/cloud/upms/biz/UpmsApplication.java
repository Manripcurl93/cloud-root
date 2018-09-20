package com.github.cloud.upms.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : czk
 * @date 2018-06-29
 */
@EnableFeignClients
@SpringCloudApplication
@MapperScan("com.github.cloud.upms.biz.mapper")
public class UpmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpmsApplication.class, args);
    }

}
