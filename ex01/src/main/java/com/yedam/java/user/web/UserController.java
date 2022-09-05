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
		//�ܼ��� �������� ��ȯ�޼ҵ� = �������� ȣ���Ҷ� ���
		return "inputForm";	//��ȯ ���ڷ� ���������� ã�ư��� 
	}
	
	@RequestMapping("/nameList")
	public String nameProcess(@RequestParam List<String> name) {
		//������ ���¸� ������ �Է��� �� @RequestParam �� ���� List�� �Է¹��� �� �ִ�
		for(String temp : name) {
			System.out.println(temp);
		}
		return "users";
	}
	
	//GetMapping �ʿ��ϴٸ� ��������� ��Ź�� ����
	//@RequestMapping(path = "/", method=RequestMethod.GET)	
	@RequestMapping("/users")
	//public String process(UserVO userVO) {
	//public String process(@RequestParam String name, @RequestParam int age) {	//�ʵ��� �������� ���ų� requestparam���� �̸��� ������� �Ѵ�
	public String process(@RequestParam Map<String, Object> map) {
		//System.out.println(userVO.getName());
		//System.out.println(userVO.getAge());
		//System.out.println(name+", "+age);
		System.out.println(map.get("name")+", "+map.get("age"));
		return "users";
	}
	
	//list����
	@RequestMapping("/userList")
	public String listProcess(UserListVO userListVO) {
		List<UserVO> userList = userListVO.getList();
		for(UserVO vo : userList) {
			System.out.println(vo.getName()+", "+vo.getAge());
		}
		return "";
	}
}
