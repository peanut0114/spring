package com.yedam.java.emp.mapper;

import com.yedam.java.emp.service.EmpVO;

public interface EmpMapper {
	//empMapper.xml에서 여기를 매핑해서 찾음 그 안에 id=getEmp 메소드를 만들어놓음
	public EmpVO getEmp(EmpVO empVO);
	
	public EmpVO getEmp2(EmpVO empVO);
}
