package com.spring_mvc.mybatis.controller;

import com.spring_mvc.mybatis.model.ProductVo;
import com.spring_mvc.mybatis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;



@Controller
public class ProductController {
    @Autowired
    ProductService service;
    // 실행 시 index페이지 열기
    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }
    // 전체 상품 조회
    @RequestMapping("/product/listAllProduct")
    public String listAllProduct(Model model) {
        ArrayList<ProductVo> prdList = service.listAllProduct();
        model.addAttribute("prdList", prdList);
        System.out.println(prdList);
        return "product/productListView";
    }
    // 상품 등록폼으로 이동
    @RequestMapping("/product/newProductForm")
    public String newProductForm() {
        return "product/newProductForm";
    }
    // 상품 등록
    @RequestMapping("/product/insertProduct")
    public String insertProduct(ProductVo prd) {
        System.out.println(prd.getPrdNo());
        service.insertProduct(prd);
        return "redirect:/product/listAllProduct";
    }
}