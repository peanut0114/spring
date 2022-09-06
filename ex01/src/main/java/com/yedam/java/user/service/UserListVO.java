package com.yedam.java.user.service;
import java.util.List;

import lombok.Data;

@Data
public class UserListVO {
	private List<UserVO> list;

	public List<UserVO> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setList(List<UserVO> list) {
		this.list = list;
	}
}
