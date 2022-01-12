package com.spring_mvc.mybatis.controller;

import com.spring_mvc.mybatis.model.ProductVo;
import com.spring_mvc.mybatis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class MVCRestController {
    @Autowired
    ProductService service;

    // 상품 검색3
    @RequestMapping("/product/productSearch3")
    public ArrayList<ProductVo> productSearch3 (@RequestParam HashMap<String, Object> param,
                                              Model model){
        System.out.println("RestController");
        ArrayList<ProductVo> prdList = service.productSearch(param);
        model.addAttribute("prdList", prdList);
        return prdList;
    }
}