package com.yedam.java.todo.service;
import lombok.Data;

@Data
public class TodoVO {
	private int no;
	private int id;
	private String contents;
	private String todoyn;	//완료여부 ( 미완료 : 0 / 완료 : 1 )
}
