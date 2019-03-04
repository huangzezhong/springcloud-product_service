package com.gz.model;

import java.io.Serializable;

public class Product implements Serializable {

    private Integer id;

    private String name; //商品名称

    private String code; //商品编码

    private String no; //商品序号

    private String price; //商品价格

    private String desc; //商品描述

    public Product(int id, String name, String code, String no, String price) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.no = no;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
