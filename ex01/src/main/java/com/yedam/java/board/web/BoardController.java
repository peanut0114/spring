package com.yedam.java.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.board.service.BoardService;
import com.yedam.java.board.service.BoardVO;

@Controller
@RequestMapping("/board")	//전체 경로를 지정해놔서 아래 경로 간단하게 ok
public class BoardController {

	@Autowired
	BoardService service;
	
	//등록 - 입력폼
	@GetMapping("/insert")
	public String insertForm(Model model) {
		model.addAttribute("no", service.getBoardNo());
		return "board/boardInsert";	//뷰만처리
	}
	
	//등록 - DB insert
	@PostMapping("/insert")
	public String insertBoard(BoardVO boardVO) {
		service.insertBoard(boardVO);
		return "redirect:list";		//등록 후 목록으로
	}
	
	//전체조회
	@GetMapping("/list")	//보안의 필요가 없어서 get매핑
	public String selectBoardList(Model model) {
		model.addAttribute("boardList",service.getBoardList());
		return "board/boardList";
	}
	
	//단건조회
	@GetMapping("/info")
	public String selectBoardInfo(BoardVO boardVO, Model model) {
		model.addAttribute("board",service.getBoardInfo(boardVO));
		return "board/boardInfo";
	}
	
	//수정 - 폼
	@GetMapping("/update")
	public String updateForm(BoardVO boardVO, Model model) {
		model.addAttribute("board",service.getBoardInfo(boardVO));
		return "board/boardUpdate";
	}
	
	//수정 - DB
	@PostMapping("/update")	
	public String updateBoardInfo(BoardVO boardVO) {
		service.updateBoard(boardVO);
		return "redirect:list";
	}
	
	//삭제
	@GetMapping("/delete/{bno}")
	public String deleteBoardInfo(@PathVariable int bno) {
		BoardVO boardVO = new BoardVO();
		boardVO.setBno(bno);
		service.deleteBoard(boardVO);
		return "redirect:/board/list";
	}
}
