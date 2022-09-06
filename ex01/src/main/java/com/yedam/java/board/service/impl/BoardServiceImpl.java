package com.yedam.java.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.board.mapper.BoardMapper;
import com.yedam.java.board.service.BoardService;
import com.yedam.java.board.service.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper mapper;
	
	@Override
	public int getBoardNo() {
		BoardVO vo = mapper.getBoardNo();
		return vo.getBno();
	}
	
	@Override
	public List<BoardVO> getBoardList() {
		return mapper.getBoardList();
	}

	@Override
	public BoardVO getBoardInfo(BoardVO boardVO) {
		return mapper.getBoardInfo(boardVO);
	}

	@Override
	public int insertBoard(BoardVO boardVO) {
		return mapper.insertBoard(boardVO);
	}

	@Override
	public int updateBoard(BoardVO boardVO) {
		return mapper.updateBoard(boardVO);
	}

	@Override
	public int deleteBoard(BoardVO boardVO) {
		return mapper.deleteBoard(boardVO.getBno());
	}

}
