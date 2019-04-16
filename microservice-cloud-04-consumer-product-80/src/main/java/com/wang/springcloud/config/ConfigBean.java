package com.wang.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    @LoadBalanced //实现了负载均衡，调用地址IP可以变成服务名,服务名称就写被调用的那个yml配置中的服务名称
    @Bean // 向容器中添加 RestTemplate 组件,直接通过此组件可调用 REST 接口
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
