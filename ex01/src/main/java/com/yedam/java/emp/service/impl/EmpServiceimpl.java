package com.yedam.java.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Service
public class EmpServiceimpl implements EmpService {

	@Autowired
	EmpMapper empMapper;
	
	@Override
	public List<EmpVO> getEmpList() {
		//데이터연산
		return empMapper.getEmpList();
	}

	@Override
	public EmpVO getEmp(EmpVO empVO) {
		return empMapper.getEmp(empVO);
	}

	@Override
	public void insertEmp(EmpVO empVO) {
		empMapper.insertEmp(empVO);
	}

	@Override
	public void updateEmp(EmpVO empVO) {
		empMapper.updateEmp(empVO);

	}

	@Override
	public void deletEemp(EmpVO empVO) {
		empMapper.deleteEmpInfo(Integer.parseInt(empVO.getEmployeeId()));
		//String으로 넘어온 값을 Int로 타입변환을 해준다
	}

}
