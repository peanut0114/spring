package com.yedam.java.todo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.todo.mapper.TodoMapper;
import com.yedam.java.todo.service.TodoService;
import com.yedam.java.todo.service.TodoVO;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoMapper mapper;

	@Override
	public List<TodoVO> getTodoList() {
		return mapper.getTodoList();
	}

	@Override
	public int insertTodo(TodoVO todoVO) {
		return mapper.insertTodo(todoVO);
	}

	@Override
	public int updateTodo(TodoVO todoVO) {
		return mapper.updateTodo(todoVO);
	}

	@Override
	public int deleteTodo(TodoVO todoVO) {
		return mapper.deleteTodo(todoVO.getNo());
	}

}
