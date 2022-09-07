package com.yedam.java.book.service;

import java.util.List;

public interface BookService {
	
	//등록
	public int insertBook(BookVO bookVO);
	//전체조회
	public List<BookVO> getBookList();
	//단건조회
	public BookVO getBookInfo(BookVO bookVO);
	//검색
	public List<BookVO> findBook(BookVO bookVO);
}

