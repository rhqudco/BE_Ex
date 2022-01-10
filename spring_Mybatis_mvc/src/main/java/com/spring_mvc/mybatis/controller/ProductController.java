package com.spring_mvc.mybatis.controller;

import com.spring_mvc.mybatis.model.ProductVo;
import com.spring_mvc.mybatis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
    // 상품 상세 정보 페이지로 이동
    @RequestMapping("/product/detailViewProduct/{prdNo}")
    public String productDetailView(@PathVariable String prdNo, Model model) {
        // 상품 번호 전달하고, 해당 상품 정보 받아오기
        ProductVo prd = service.detailViewProduct(prdNo);
        model.addAttribute("prd", prd);
        return "product/productDetailView"; // 상품 상세 정보 뷰 페이지
    }
    // 상품 정보 수정 화면으로 이동(수정하기 위해 상품 상세 정보를 화면에 먼저 출력)
    @RequestMapping("/product/updateProductForm/{prdNo}")
    public String updateProductForm(@PathVariable String prdNo, Model model) {
        // 상품 번호 전달하고, 해당 상품 정보 받아오기
        ProductVo prd = service.detailViewProduct(prdNo); // 상세 상품 조회 메소드 그대로 사용
        model.addAttribute("prd", prd);
        return "product/updateProductForm";
    }
    // 상품 정보 수정 : 수정된 상품 정보를 DB에 저장
    @RequestMapping("/product/updateProduct")
    public String detailViewProduct(ProductVo prd) {
        service.updateProduct(prd);
        return "redirect:/product/listAllProduct";  // 전체 상품 조회 페이지로 포워딩
    }
    @RequestMapping("/product/deleteProduct/{prdNo}")
    public String deleteProduct(@PathVariable String prdNo) {
        service.deleteProduct(prdNo);
        System.out.println(prdNo);
        return "redirect:/product/listAllProduct";
    }
}