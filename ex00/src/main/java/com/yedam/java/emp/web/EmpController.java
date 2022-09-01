package com.yedam.java.emp.web;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@Controller
public class EmpController {
	
	@Autowired
	EmpMapper empMapper;	//empMapper는 외부에 있기 때문에
	
	@GetMapping("/emp")
	public String emp(Model model, EmpVO empVO) {	//보내온 값을 알아서 넣어줌
		//empVO 담긴 정보를 기반으로 결과 반환 //emp필드와 get 방식으로 들어오는 형태가 같음
		EmpVO findVO = empMapper.getEmp(empVO);
		model.addAttribute("emp",findVO);	//값을 넣어서 보내줌 -> jsp에서 ${}로 값을 꺼내 쓴다 (자동화)
		
		return "emp";
	}
	/*원래 쓰던 방식
	//HttpRequest로 받아오고 HttpResponse에 넣어서 반환
	public String method(HttpRequest res, HttpResponse res)
	*/
}
