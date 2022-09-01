package com.yedam.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpController {
	
	@Autowired
	EmpMapper empMapper;	//empMapper�� �ܺο� �ֱ� ������
	
	@GetMapping("/emp")
	public String emp(Model model, EmpVO empVO) {
		//empVO ��� ������ ������� ��� ��ȯ
		EmpVO findVO = empMapper.getEmp(empVO);
		model.addAttribute("emp",findVO);
		
		return "emp";
	}
}
