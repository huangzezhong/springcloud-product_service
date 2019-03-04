package com.gz.service.impl;

import com.gz.dao.ProductDao;
import com.gz.model.Product;
import com.gz.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> qryProductList() {
        return ProductDao.qryProductList();
    }

    @Override
    public Product qryProductById(Integer id) {
        return ProductDao.qryProductById(id);
    }
}
