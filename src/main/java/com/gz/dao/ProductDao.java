package com.gz.dao;

import com.gz.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    public static List<Product> productList = new ArrayList<Product>();

    /**
     * 数据放入内存，模拟数据库数据
     */
    static {
        Product product1 = new Product(1,"国行正品iphone6","A001","1","3000元");
        Product product2 = new Product(2,"国行正品iphone6s","A002","2","3300元");
        Product product3 = new Product(3,"国行正品iphone7","A003","3","3800元");
        Product product4 = new Product(4,"国行正品iphone7s","A004","4","4000元");
        Product product5 = new Product(5,"国行正品iphone8","A005","5","4500元");
        Product product6 = new Product(6,"国行正品iphoneX","A006","6","5000元");
        Product product7 = new Product(7,"国行正品iphoneX-Max","A007","7","10000元");
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
    }

    public static List<Product> qryProductList(){
        return productList;
    }

    public static Product qryProductById(Integer id){
        for (Product product: productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

}
