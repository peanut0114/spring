package com.yedam.java.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.board.service.BoardService;
import com.yedam.java.board.service.BoardVO;

@Controller
@RequestMapping("/board")	//��ü ��θ� �����س��� �Ʒ� ��� �����ϰ� ok
public class BoardController {

	@Autowired
	BoardService service;
	
	//���-�Է���
	@GetMapping("/insert")
	public String insertForm(Model model) {
		model.addAttribute("no", service.getBoardNo());
		return "board/boardInsert";	//�丸ó��
	}
	
	//���-DB insert
	@PostMapping("/insert")
	public String insertBoard(BoardVO boardVO) {
		service.insertBoard(boardVO);
		return "redirect:list";		//��� �� �������
	}
	
	//��ü��ȸ
	@GetMapping("/list")	//������ �ʿ䰡 ��� get����
	public String selectBoardList(Model model) {
		model.addAttribute("boardList",service.getBoardList());
		return "board/boardList";
	}
}
