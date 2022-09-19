package com.yedam.java.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface TodoService {
	
	//전체조회
	public List<TodoVO> getTodoList();
	//등록
	public int insertTodo(TodoVO TodoVO);
	//수정
	public int updateTodo(TodoVO TodoVO);
	//삭제
	public int deleteTodo(TodoVO TodoVO);

}
