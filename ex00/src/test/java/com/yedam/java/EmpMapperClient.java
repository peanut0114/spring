package com.yedam.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class EmpMapperClient {

	@Autowired
	EmpMapper empMapper;
	
	@Test
	public void getEmp() {
		EmpVO vo = new EmpVO();
		vo.setEmployee_id("100");
		EmpVO findVO = empMapper.getEmp(vo);
		
		System.out.println(findVO.getLast_name()+findVO.salary);
		assertEquals(findVO.getLast_name(),"King");	//예상값과 일치하는지 확인
		
		
		EmpVO findVO2 = empMapper.getEmp2(vo);
		System.out.println(findVO2.getLast_name()+findVO2.getSalary());
		
	}
}
