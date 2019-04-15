package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wangtong on 2019/4/11.
 * eureka 注册中心
 *
 */
@EnableEurekaServer  //标识一个eureka服务端（服务注册中心）
@SpringBootApplication
public class EurekaServer_6002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_6002.class, args);
    }


}
