package com.yedam.java.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.emp.service.EmpVO;

public interface EmpMapper {
	//��ü��ȸ
	public List<EmpVO> getEmpList();
	//�ܰ���ȸ : ��ȸ���� - EmpVO
	public EmpVO getEmp(EmpVO empVO);
	//���
	public int insertEmp(EmpVO empVO);
	//���� : ���� 10% �λ� //�Ű����� �̸��� �ٸ� ��� Param���� ��������
	public int updateSalary(@Param("empId")int employeeId);
	
	//���� : ��������� �Ѱܹ޾Ƽ� �̸��� ��, �̸����� ������ �� �ִ� �޼ҵ�
	public int updateEmp(EmpVO empVO);
	
	//����
	public int deleteEmpInfo(int employeeId);
}
