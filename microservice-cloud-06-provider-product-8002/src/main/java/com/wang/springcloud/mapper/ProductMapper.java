package com.wang.springcloud.mapper;

import com.wang.springcloud.entities.Product;

import java.util.List;

/**
 * Created by wangtong on 2019/4/10.
 */
//@Mapper
//或者在启动类上标识 @MapperScan
//或者在每个接口上面使用@Mapper进行标识
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);

}
