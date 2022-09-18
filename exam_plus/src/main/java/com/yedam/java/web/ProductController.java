package com.yedam.java.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.product.service.ProductService;
import com.yedam.java.product.service.ProductVo;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService service;

	// 전체 상품 출력 페이지
	@GetMapping("/list")
	public String productList(Model model) {
		model.addAttribute("productList", service.getAllProduct());
		return "product/list";
	}

	// 등록페이지 - 폼
	@GetMapping("/insert")
	public String productInsertForm(Model model) {
		model.addAttribute("productId", service.getProductId());
		return "product/insert";
	}

	// 등록페이지 - DB
	@PostMapping("/insert")
	public String productInsert(ProductVo productVo	) {
		service.insertProduct(productVo);
		return "product/list";
	}
}
