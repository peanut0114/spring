package com.yedam.java.user.service;

import lombok.Data;

@Data
public class UserVO {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	private String name;
	private Integer age;	//map 이용시 object가 되어서 Integer 사용
}
