package com.yedam.java.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface TodoService {
	//신규글 번호 
	public int getTodoNO();
	//전체조회
	public List<TodoVO> getTodoList(TodoVO todoVO);
	//단건조회
	public TodoVO getTodoInfo(TodoVO todoVO);
	//등록
	public int insertTodo(TodoVO todoVO);
	//수정
	public int updateTodo(TodoVO todoVO);
	//삭제
	public int deleteTodo(TodoVO todoVO);
}
