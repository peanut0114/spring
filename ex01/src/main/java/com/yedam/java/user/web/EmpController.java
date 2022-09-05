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

//CRUD�� ���� ���̺��� �߻��� �� �����Ƿ� �и����ִ°�
@Controller
@RequestMapping("/emp")	//��Ʈ�ѷ��� �ִ� ��θ� ���� ����
public class EmpController {
	
	@Autowired
	EmpService empService;	//���� ���� ���񽺸� ���� �޾ƿ��Ƿ� @Autowired�� ���� �����Ѵ�
	
	@GetMapping("/allList")	// ��Ʈ�ѷ��� ����� �Ʒ��� �����̵ȴ� /java/emp/allList
	public String getEmpList(Model model) {
		model.addAttribute("empList",empService.getEmpList());	//�信�� ����� �̸��� ���� ���� �Ѱ��ش�
		return "emp/empList";	//views ���� �Ʒ�, emp ���� ���� empList.jsp ȣ��
	}
	
	@GetMapping("/getInfo")
	public String getEmpInfo(Model model, EmpVO empVO) {	//Ŀ�ǵ� ��ü�� ���� ���� �Ŷ� �ܼ��� ���� ����
		model.addAttribute("empInfo", empService.getEmp(empVO));	//�̸��� ���ؼ� �ѱ��
		return "emp/empInfo";
	}
	
	@PostMapping("/updateInfo")	//������Ʈ�� ������ ���� �����ϴ� ���̶� Post��� �̿�
	public String updateEmpInfo(EmpVO empVO) {	
		empService.updateEmp(empVO);
		return "redirect:allList";	//redirect�� ����η� /updateInfo�� ��ü�� allList�� �ִ´�
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
