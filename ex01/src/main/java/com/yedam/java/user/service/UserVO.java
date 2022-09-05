package com.yedam.java.user.service;

import lombok.Data;

@Data
public class UserVO {
	private String name;
	private Integer age;	//map 이용시 object가 되어서 Integer 사용
}
