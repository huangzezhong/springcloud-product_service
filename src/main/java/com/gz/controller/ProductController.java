package com.gz.controller;

import com.alibaba.fastjson.JSON;
import com.gz.model.Product;
import com.gz.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 商品服务接口
 */
@RestController
@Slf4j
@RefreshScope
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Value("${env}")
    private String env;

    @Autowired
    private ProductService productService;

    @RequestMapping("/api/vi/product/find")
    public String qryProductList(){
        List<Product> list = productService.qryProductList();
        String result = JSON.toJSONString(list);
        return result;
    }

    @RequestMapping("/api/vi/product/findById")
    public String qryProductById(@RequestParam Integer id){
        Product product = productService.qryProductById(id);
        product.setDesc("port="+port+",env="+env);
        String result = JSON.toJSONString(product);
        log.info("result:{}",result);
        /*try {
            TimeUnit.SECONDS.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return result;
    }


}
