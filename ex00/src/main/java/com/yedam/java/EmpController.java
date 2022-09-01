package com.yedam.java;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpController {
	
	@Autowired
	EmpMapper empMapper;	//empMapper�� �ܺο� �ֱ� ������
	
	@GetMapping("/emp")
	public String emp(Model model, EmpVO empVO) {	//������ ���� �˾Ƽ� �־���
		//empVO ��� ������ ������� ��� ��ȯ //emp�ʵ�� get ������� ������ ���°� ����
		EmpVO findVO = empMapper.getEmp(empVO);
		model.addAttribute("emp",findVO);	//���� �־ ������ -> jsp���� ${}�� ���� ���� ���� (�ڵ�ȭ)
		
		return "emp";
	}
	/*���� ���� ���
	//HttpRequest�� �޾ƿ��� HttpResponse�� �־ ��ȯ
	public String method(HttpRequest res, HttpResponse res)
	*/
}
