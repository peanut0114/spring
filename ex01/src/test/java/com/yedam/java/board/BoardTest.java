package com.yedam.java.board;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.board.mapper.BoardMapper;
import com.yedam.java.board.service.BoardService;
import com.yedam.java.board.service.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class BoardTest {
	
	@Autowired
	BoardService service;
	
	@Autowired
	BoardMapper mapper;
	
	//@Test //mapper�� �׽�Ʈ
	public void boardMapperTest() {
		List<BoardVO> list = mapper.getBoardList();
		assertNotNull(list);
	}
	
	@Test
	public void BoardAllProcess() {
		//���
		BoardVO info = new BoardVO();
		info.setTitle("�׽�Ʈ-����");
		info.setContents("�׽�Ʈ-����");
		info.setWriter("�׽�Ʈ-�ۼ���");
		
		int result = service.insertBoard(info);
		
		assertEquals(result,1);
		
		//�ܰ���ȸ
		BoardVO findVO = service.getBoardInfo(info);
		assertNotNull(findVO);
		
		//����
		info.setContents("����-����");
		result = service.updateBoard(info);
		assertEquals(result,1);
		
		//��ü��ȸ
		List<BoardVO> list = service.getBoardList();
		assertNotNull(list);
		
		//����
		result = service.deleteBoard(info);
		assertEquals(result,1);
	}
}
