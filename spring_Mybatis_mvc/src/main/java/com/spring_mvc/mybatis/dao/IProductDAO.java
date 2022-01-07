package com.spring_mvc.mybatis.dao;

import com.spring_mvc.mybatis.model.ProductVo;

import java.util.ArrayList;

public interface IProductDAO {
    ArrayList<ProductVo> listAllProduct(); // 전체 상품 조회
    void insertProduct(ProductVo productVo); // 상품 정보 등록
    void updateProduct(ProductVo productVo); // 상품 정보 수정
    void deleteProduct(String prdNo); // 상품 정보 삭제
    ProductVo detailViewProduct(String prdNo); // 특정 상품 조회
}