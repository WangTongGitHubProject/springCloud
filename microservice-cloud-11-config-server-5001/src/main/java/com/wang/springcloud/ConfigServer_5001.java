package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by wangtong on 2019/4/19.
 */
@EnableConfigServer //开启配置中心功能
@SpringBootApplication
public class ConfigServer_5001 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_5001.class, args);
    }
}
