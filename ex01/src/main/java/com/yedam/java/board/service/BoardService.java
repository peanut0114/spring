package com.yedam.java.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BoardService {
//�⺻������ ���ۿ� �����ϰ� ó�� + �� �� ó��(��� ���� ����)
	
	//�Խñ� ��ȸ
	public int getBoardNo();
	//��ü��ȸ
	public List<BoardVO> getBoardList();
	//�ܰ���ȸ
	public BoardVO getBoardInfo(BoardVO boardVO);
	//���
	public int insertBoard(BoardVO boardVO);
	//����
	public int updateBoard(BoardVO boardVO);
	//����
	public int deleteBoard(BoardVO boardVO);

}
