package com.wang.springcloud.service;

import com.wang.springcloud.entities.Product;

import java.util.List;

/**
 * Created by wangtong on 2019/4/10.
 */
public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();
}
