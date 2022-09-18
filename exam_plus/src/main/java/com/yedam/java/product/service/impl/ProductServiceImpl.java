package com.yedam.java.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.product.mapper.ProductMapper;
import com.yedam.java.product.service.ProductService;
import com.yedam.java.product.service.ProductVo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductMapper mapper;
	
	@Override
	public int getProductId() {
		return mapper.getProductNo();
	}

	@Override
	public int insertProduct(ProductVo productVo) {
		return mapper.insertProduct(productVo);
	}

	@Override
	public List<ProductVo> getAllProduct() {
		return mapper.selectAllProduct();
	}

}
