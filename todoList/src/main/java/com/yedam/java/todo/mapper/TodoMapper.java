package com.yedam.java.todo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yedam.java.todo.service.TodoVO;

@Mapper
public interface TodoMapper {

	//전체조회
	public List<TodoVO> getTodoList();
	//등록
	public int insertTodo(TodoVO todoVO);
	//수정
	public int updateTodo(TodoVO todoVO);
	//삭제
	public int deleteTodo(int no);
}
