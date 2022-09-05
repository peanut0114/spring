package com.yedam.java.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

//CRUD가 여러 테이블에서 발생할 수 있으므로 분리해주는것
@Controller
@RequestMapping("/emp")	//컨트롤러에 있는 경로를 먼저 들어가고
public class EmpController {
	
	@Autowired
	EmpService empService;	//실제 값은 서비스를 통해 받아오므로 @Autowired를 통해 주입한다
	
	@GetMapping("/allList")	// 컨트롤러의 경로의 아래에 매핑이된다 /java/emp/allList
	public String getEmpList(Model model) {
		model.addAttribute("empList",empService.getEmpList());	//뷰에서 사용할 이름과 실제 값을 넘겨준다
		return "emp/empList";	//views 폴더 아래, emp 폴더 안의 empList.jsp 호출
	}
	
	@GetMapping("/getInfo")
	public String getEmpInfo(Model model, EmpVO empVO) {	//커맨드 객체를 통해 받을 거라 단순히 보로 설정
		model.addAttribute("empInfo", empService.getEmp(empVO));	//이름을 정해서 넘긴다
		return "emp/empInfo";
	}
	
	@PostMapping("/updateInfo")	//업데이트는 정보가 많고 수정하는 것이라 Post방식 이용
	public String updateEmpInfo(EmpVO empVO) {	
		empService.updateEmp(empVO);
		return "redirect:allList";	//redirect는 상대경로로 /updateInfo를 대체할 allList를 넣는다
	}
	
	@GetMapping("/deleteInfo/{employeeId}")
	public String deleteEmpInfo(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		empService.deletEemp(empVO);
		return "redirect:/emp/allList";
	}
	
	@GetMapping("/insertFrom")
	public String insertEmpInfoForm(EmpVO empVO) {
		return "emp/empInsert";
	}
	
	@GetMapping("/insertInfo")
	public String insertEmpInfo(EmpVO empVO) {
		empService.insertEmp(empVO);
		return "redirect:/emp/allList";
	}
}
