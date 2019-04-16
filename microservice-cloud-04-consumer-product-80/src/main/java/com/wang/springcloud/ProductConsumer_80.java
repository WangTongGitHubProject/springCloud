package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by wangtong on 2019/4/11.
 * 商品消费者
 */
@EnableEurekaClient //标识是一个eureka客户端
@SpringBootApplication
public class ProductConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_80.class, args);
    }


}
