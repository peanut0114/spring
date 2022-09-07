package com.yedam.java.emp.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;
import com.yedam.java.emp.service.EmpReqVO;
import com.yedam.java.emp.service.EmpVO;

@Controller
@RequestMapping("/book")
public class BookController {

	Logger logger = LoggerFactory.getLogger(BookController.class);

	@Autowired
	BookService service;

	// 등록 - 입력폼
	@GetMapping("/insert")
		public String insertForm() {
			return "book/bookInsert";	//뷰만처리
		}

	// 등록 - DB insert
	@PostMapping("/insert")
	public String insertBook(BookVO bookdVO) {
		service.insertBook(bookdVO);
		return "redirect:list"; // 등록 후 목록으로
	}

	// 전체조회
	@GetMapping("/list")
	public String selectBoardList(Model model) {
		model.addAttribute("bookList", service.getBookList());
		return "book/bookList";
	}

	//단건조회
	@GetMapping("/info")
	public String selectBoardInfo(BookVO bookVO, Model model) {
		model.addAttribute("book",service.getBookInfo(bookVO));
		return "book/bookInfo";
	}


}
