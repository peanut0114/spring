package com.yedam.java.emp.service;

import lombok.Data;

@Data	//lombok
public class EmpVO {
	String employeeId;	//employee_id 형태로 자동변환해줌
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String hireDate;
	String jobId;
	String salary;
	String commissionPct;
	String managerId;
	String departmentId;
}
