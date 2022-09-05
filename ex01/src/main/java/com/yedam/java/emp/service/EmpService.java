package com.yedam.java.emp.service;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface EmpService {

	//��ü��ȸ
	public List<EmpVO> getEmpList();
	//�ܰ���ȸ
	public EmpVO getEmp(EmpVO empVO);
	//���
	public void insertEmp(EmpVO empVO);
	//����
	public void updateEmp(EmpVO empVO);
	//����
	public void deletEemp(EmpVO empVO);
}
