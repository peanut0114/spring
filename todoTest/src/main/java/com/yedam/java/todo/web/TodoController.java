package com.yedam.java.todo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.todo.service.TodoService;
import com.yedam.java.todo.service.TodoVO;

@RestController	//뷰가 아닌 데이터를 반환하는 컨트롤러
@CrossOrigin(origins = "*")
public class TodoController {

	@Autowired
	TodoService service;
	
	//전체출력
	@GetMapping("/todo")
	public List<TodoVO> getTodoList(TodoVO todoVO) {
		return service.getTodoList(todoVO);	
	}
	
	//등록
	@PostMapping("/todo")
	public int todoInsert(TodoVO todoVO) {
		return service.insertTodo(todoVO);
		 
	}
	
	//수정
	@PutMapping("/todo")
	public int todoUpdate(TodoVO todoVO) {
		return service.updateTodo(todoVO);
	}
	
	//삭제
	@DeleteMapping("/todo/{no}")
	public TodoVO todoDelete(@PathVariable int no) {
		TodoVO todoVO = new TodoVO();
		todoVO.setNo(no);
		service.deleteTodo(todoVO);
		return todoVO;
	}
}
