package com.yedam.java.product.service;

import java.util.List;

public interface ProductService {
	//번호 조회
	public int getProductId();
	//상품 등록
	public int insertProduct(ProductVo productVo);
	//전체 상품 정보 조회
	public List<ProductVo> getAllProduct();
}
