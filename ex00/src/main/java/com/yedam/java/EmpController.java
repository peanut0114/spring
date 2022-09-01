package com.yedam.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpController {
	
	@Autowired
	EmpMapper empMapper;	//empMapper는 외부에 있기 때문에
	
	@GetMapping("/emp")
	public String emp(Model model, EmpVO empVO) {
		//empVO 담긴 정보를 기반으로 결과 반환
		EmpVO findVO = empMapper.getEmp(empVO);
		model.addAttribute("emp",findVO);
		
		return "emp";
	}
}
