package com.wang.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wangtong on 2019/4/11.
 */
@Configuration //标识配置类
public class ConfigBean {

    /**
     * 向容器中注入 RestTemplate 组件,
     * 提供了多种简单便捷的访问 Restful 服务的方法，
     * 是Spring提供的用于访问Rest服务的客户端模板工具集。
     * (url, requestMap, ResponseBean.class)这三个参数分别代表：
        REST请求地址、请求参数、HTTP响应转换被转换成的对象类型
     * @return
     */
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
