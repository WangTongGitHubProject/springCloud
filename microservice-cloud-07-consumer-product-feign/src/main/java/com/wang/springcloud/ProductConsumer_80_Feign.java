package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by wangtong on 2019/4/11.
 * 商品消费者
 */
//会扫描指定包下使用@FeignClient标识的接口
@EnableFeignClients(basePackages = "com.wang.springcloud.service")
@EnableEurekaClient //标识是一个eureka客户端
@SpringBootApplication
public class ProductConsumer_80_Feign {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_80_Feign.class, args);
    }

}
