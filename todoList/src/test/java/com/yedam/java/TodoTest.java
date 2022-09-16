package com.yedam.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.todo.mapper.TodoMapper;
import com.yedam.java.todo.service.TodoVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class TodoTest {
	
	@Autowired
	TodoMapper mapper;
	
	//@Test
	public void todoListTest() {
		List<TodoVO> todoList = mapper.getTodoList();
		for(TodoVO todoVO : todoList) {
			System.out.println(todoVO.getNo()+". "+todoVO.getContents());
		}
		assertNotNull(todoList);
	}
	
	//@Test
	public void todoInsertTest() {
		TodoVO info = new TodoVO();
		info.setContents("테스트 내용4");
		info.setId(88);
		int result = mapper.insertTodo(info);
		assertEquals(result,1);
	}
	
	//@Test
	public void todoUpdateTest() {
		TodoVO info = new TodoVO();
		info.setNo(6);
		info.setId(6);
		info.setContents("내용 수정 test");
		info.setTodoyn("1");
		mapper.updateTodo(info);
		int result = mapper.updateTodo(null);
		assertEquals(result,1);
	}
	
	@Test
	public void todoDeleteTest() {
		int result = mapper.deleteTodo(8);
		assertEquals(result, 1);
	}

}
