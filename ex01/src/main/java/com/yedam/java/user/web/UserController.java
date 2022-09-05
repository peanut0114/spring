package com.yedam.java.user.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.java.user.service.UserListVO;
import com.yedam.java.user.service.UserVO;

@Controller
public class UserController {
	
	@RequestMapping(value="inputForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String inputForm() {
		//단순히 문자형태 반환메소드 = 뷰페이지 호출할때 사용
		return "inputForm";	//반환 문자로 뷰페이지를 찾아간다 
	}
	
	@RequestMapping("/nameList")
	public String nameProcess(@RequestParam List<String> name) {
		//동일한 형태를 여러개 입력할 때 @RequestParam 를 통해 List로 입력받을 수 있다
		for(String temp : name) {
			System.out.println(temp);
		}
		return "users";
	}
	
	//GetMapping 필요하다면 경로지정과 통신방식 가능
	//@RequestMapping(path = "/", method=RequestMethod.GET)	
	@RequestMapping("/users")
	//public String process(UserVO userVO) {
	//public String process(@RequestParam String name, @RequestParam int age) {	//필드명과 변수명이 같거나 requestparam에서 이름을 맞춰줘야 한다
	public String process(@RequestParam Map<String, Object> map) {
		//System.out.println(userVO.getName());
		//System.out.println(userVO.getAge());
		//System.out.println(name+", "+age);
		System.out.println(map.get("name")+", "+map.get("age"));
		return "users";
	}
	
	//list형식
	@RequestMapping("/userList")
	public String listProcess(UserListVO userListVO) {
		List<UserVO> userList = userListVO.getList();
		for(UserVO vo : userList) {
			System.out.println(vo.getName()+", "+vo.getAge());
		}
		return "";
	}
}
