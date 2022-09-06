package com.yedam.java.board.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.yedam.java.board.service.BoardVO;

public interface BoardMapper {
	//�Խñ� ��ȣ ��ȸ
	public BoardVO getBoardNo();
	//��ü��ȸ
	public List<BoardVO> getBoardList();
	//�ܰ���ȸ
	public BoardVO getBoardInfo(BoardVO boardVO);
	//���
	public int insertBoard(BoardVO boardVO);
	//����
	public int updateBoard(BoardVO boardVO);
	//����
	//public int deleteBoard(@Param("bno") int boardNo);	//�÷��� �������� �ٸ��� param�� ���� �ӽú����� �������� �˷���
	public int deleteBoard(int boardNo);	//�÷��� ���� �ʿ���� �̷��� �־ �ȴ�
}
