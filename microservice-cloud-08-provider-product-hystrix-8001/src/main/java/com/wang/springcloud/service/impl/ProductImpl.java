package com.wang.springcloud.service.impl;

import com.wang.springcloud.entities.Product;
import com.wang.springcloud.mapper.ProductMapper;
import com.wang.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangtong on 2019/4/10.
 */
@Service //放到容器中，一定不要少了
public class ProductImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Product get(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}
