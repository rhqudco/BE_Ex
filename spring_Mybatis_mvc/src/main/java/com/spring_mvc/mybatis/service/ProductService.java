package com.spring_mvc.mybatis.service;

import com.spring_mvc.mybatis.dao.IProductDAO;
import com.spring_mvc.mybatis.model.ProductVo;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService implements IProductService{
    // MyBatis 사용할 때는
    @Setter(onMethod_ = {@Autowired})
    @Qualifier("IProductDAO")
    IProductDAO dao;
    @Override
    public ArrayList<ProductVo> listAllProduct() {
        return dao.listAllProduct();
    }
    @Override
    public void insertProduct(ProductVo productVo) {
        dao.insertProduct(productVo);
    }
    @Override
    public void updateProduct(ProductVo productVo) {
        dao.updateProduct(productVo);
    }
    @Override
    public void deleteProduct(String prdNo) {
        dao.deleteProduct(prdNo);
    }
    @Override
    public ProductVo detailViewProduct(String prdNo) {
        return dao.detailViewProduct(prdNo);
    }
}
