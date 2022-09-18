package com.yedam.java.product.mapper;

import java.util.List;

import com.yedam.java.product.service.ProductVo;

public interface ProductMapper {

	//상품 번호 조회
	public int getProductNo();
	//상품 등록
	public int insertProduct(ProductVo productVo);
	//전체 상품 정보 조회
	public List<ProductVo> selectAllProduct();
	
}
