package com.yedam.java.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@RestController	//뷰가 아닌 데이터를 반환하는 컨트롤러
@CrossOrigin(origins = "http://192.168.0.83:8090")	//동일한 경로가 아닌 외부에서 들어오는 요청을 설정 (내가 rest서버일때 처리방법)
public class EmpRestController {
	
	@Autowired
	EmpService service;
	
	//전체조회
	@GetMapping("/emp")
	public List<EmpVO> empSelect(){
		return service.getEmpList();
	}
	
	//사원조회
	@GetMapping("/emp/{employeeId}")	//rest방식
	public EmpVO empfind(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		return service.getEmp(empVO);
	}
	
	//사원등록 - json 형태로 받을 것
	@PostMapping("/emp")
	public EmpVO empInsert(@RequestBody EmpVO empVO) {
		service.insertEmp(empVO);
		return empVO;
	}
	
	//사원수정
	@PutMapping("/emp/{employeeId}")	//경로에 접근하려는 사원정보, body에 수정하려는 정보를 가져온다
	public EmpVO empUpdate(@PathVariable String employeeId, @RequestBody EmpVO empVO) {
		empVO.setEmployeeId(employeeId);
		service.updateEmp(empVO);
		return empVO;
	}
	
	//사원삭제
	@DeleteMapping("/emp/{employeeId}")
	public EmpVO empDelete(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		service.deletEemp(empVO);;
		return empVO;
	}
}
