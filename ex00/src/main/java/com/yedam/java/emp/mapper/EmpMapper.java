package com.yedam.java.emp.mapper;

import com.yedam.java.emp.service.EmpVO;

public interface EmpMapper {
	//empMapper.xml���� ���⸦ �����ؼ� ã�� �� �ȿ� id=getEmp �޼ҵ带 ��������
	public EmpVO getEmp(EmpVO empVO);
	
	public EmpVO getEmp2(EmpVO empVO);
}
