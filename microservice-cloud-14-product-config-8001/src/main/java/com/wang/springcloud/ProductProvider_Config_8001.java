package com.wang.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by wangtong on 2019/4/10.
 * 商品提供者
 *
 */
@EnableEurekaClient //将此服务注册到eureka 服务注册中心
@MapperScan("com.wang.springcloud.mapper") //扫描所有Mapper接口
@SpringBootApplication
public class ProductProvider_Config_8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_Config_8001.class, args);
    }

}
