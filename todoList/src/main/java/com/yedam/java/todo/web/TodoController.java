package com.yedam.java.todo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.todo.service.TodoService;
import com.yedam.java.todo.service.TodoVO;

@Controller
@RequestMapping("/Todo")	
public class TodoController {

	@Autowired
	TodoService service;
	
	//등록 - 폼
	@GetMapping("/insert")
	public String insertForm(Model model) {
		return "todo/todoInsert";	
	}
	
	//등록 - DB insert
	@PostMapping("/insert")
	public String insertTodo(TodoVO todoVO) {
		service.insertTodo(todoVO);
		return "redirect:list";
	}
	
	//전체조회
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@GetMapping("/list")	
	public String selectTodoList(Model model) {
		model.addAttribute("TodoList",service.getTodoList());
		return "Todo/TodoList";
	}
	
	//수정 - DB
	@PostMapping("/update")	
	public String updateTodoInfo(TodoVO TodoVO) {
		service.updateTodo(TodoVO);
		return "redirect:list";
	}
	
	//삭제
	@GetMapping("/delete/{no}")
	public String deleteTodoInfo(@PathVariable int no) {
		TodoVO TodoVO = new TodoVO();
		TodoVO.setNo(no);
		service.deleteTodo(TodoVO);
		return "redirect:/Todo/list";
	}
}
