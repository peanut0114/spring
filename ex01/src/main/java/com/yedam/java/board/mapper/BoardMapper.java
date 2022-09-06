package com.yedam.java.board.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.yedam.java.board.service.BoardVO;

public interface BoardMapper {
	//게시글 번호 조회
	public BoardVO getBoardNo();
	//전체조회
	public List<BoardVO> getBoardList();
	//단건조회
	public BoardVO getBoardInfo(BoardVO boardVO);
	//등록
	public int insertBoard(BoardVO boardVO);
	//수정
	public int updateBoard(BoardVO boardVO);
	//삭제
	//public int deleteBoard(@Param("bno") int boardNo);	//컬럼과 변수명이 다를때 param을 통해 임시변수가 무엇인지 알려줌
	public int deleteBoard(int boardNo);	//컬럼과 같을 필용없이 이렇게 넣어도 된다
}
