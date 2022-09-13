package com.yedam.java.todo.mapper;

import java.util.List;

import com.yedam.java.todo.service.TodoVO;

public interface TodoMapper {

	//입력할 번호 조회(max+1)
	public TodoVO getTodoNo();
	//전체조회
	public List<TodoVO> getTodoList();
	//단건조회
	public TodoVO getTodoInfo(TodoVO todoVO);
	//등록
	public int insertTodo(TodoVO todoVO);
	//수정
	public int updateTodo(TodoVO todoVO);
	//삭제
	public int deleteTodo(int no);
}
