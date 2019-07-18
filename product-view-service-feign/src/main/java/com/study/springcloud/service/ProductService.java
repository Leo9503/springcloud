package com.study.springcloud.service;

import com.study.springcloud.client.ProductClientFeign;
import com.study.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;

    public List<Product> listProducts() {
        return productClientFeign.listProdcuts();

    }
}
