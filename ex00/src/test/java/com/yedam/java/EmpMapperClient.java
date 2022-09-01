package com.yedam.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class EmpMapperClient {

	@Autowired
	EmpMapper empMapper;
	
	@Test
	public void getEmp() {
		EmpVO vo = new EmpVO();
		vo.setEmployeeId("100");
		EmpVO findVO = empMapper.getEmp(vo);
		
		System.out.println(findVO.getLastName()+findVO.getSalary());
		assertEquals(findVO.getLastName(),"King");	//예상값과 일치하는지 확인
		
		
		EmpVO findVO2 = empMapper.getEmp2(vo);
		System.out.println(findVO2.getLastName()+findVO2.getSalary());
		
	}
}
