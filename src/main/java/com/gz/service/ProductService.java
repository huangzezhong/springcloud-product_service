package com.gz.service;

import com.gz.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> qryProductList();

    public Product qryProductById(Integer id);

}
