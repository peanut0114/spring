package com.yedam.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.todo.service.TodoService;
import com.yedam.java.todo.service.TodoVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class TodoTest {

	@Autowired
	TodoService service;
	
	@Test
	public void todoProcess() {
//		//등록
//		TodoVO info = new TodoVO();
//		info.setId(88);
//		info.setContents("test");
//		
//		int result = service.insertTodo(info);
//		assertEquals(result, 1);
//		
//		//전체출력
//		List<TodoVO> list = service.getTodoList();
//		assertNotNull(list);
//		
//		//단건조회
//		TodoVO findVO = service.getTodoInfo(info);
//		assertNotNull(findVO);
//		
		//수정
		TodoVO updateVO = new TodoVO();
		updateVO.setNo(11);
		updateVO.setId(88);
		updateVO.setTodoyn("1");
		int updateResult = service.updateTodo(updateVO);
		assertEquals(updateResult, 1);
		
		//삭제
		TodoVO vo = new TodoVO();
		vo.setNo(12);
		int delResult = service.deleteTodo(vo);
		assertEquals(delResult, 1);
	}
	
}
