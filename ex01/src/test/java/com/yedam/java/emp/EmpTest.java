package com.yedam.java.emp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class EmpTest {

	@Autowired
	EmpMapper empMapper;
	

	public void empListTest() {
		List<EmpVO> findList = empMapper.getEmpList();
		for(EmpVO findVO : findList) {
			System.out.println(findVO.getLastName()+" "+findVO.getFirstName());
		}
	}
	
	@Test
	public void empInfoTest() {
		EmpVO info = new EmpVO();
		info.setEmployeeId("101");
		EmpVO findVO = empMapper.getEmp(info);
		assertNotNull(findVO.getEmail());
	}
	
	
	public void empInsertTest() {
		EmpVO info = new EmpVO();
		info.setFirstName("Èù³²³ë");
		info.setLastName("ÅÂÇ³");
		info.setEmail("11ho@google.com");
		info.setJobId("AC_MGR");
		info.setSalary("97000");
		empMapper.insertEmp(info);
		assertEquals(info.getEmployeeId(),"258");
	}
	
	public void empUpdateSalaryTest() {
		int result = empMapper.updateSalary(100);
		assertEquals(result,1);
	}
	
	
	public void empUpdateEmpTest() {
		EmpVO info = new EmpVO();
		info.setEmployeeId("255");
		info.setFirstName("Happy");
		info.setLastName("PuPPy");
		//info.setEmail("HAPPYDOG");
		int result = empMapper.updateEmp(info);
		assertEquals(result,1);
	}
	
}
