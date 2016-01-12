package com.main.domain;


import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.main.SshProjectApplication;
import com.main.repository.EmployeeRepos;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SshProjectApplication.class)
public class EmployeeTest {
	@Autowired
	private EmployeeRepos employeeRepos; //sessionFactory
	
	public void setEmployeeRepos(EmployeeRepos employeeRepos) {
		this.employeeRepos = employeeRepos;
	}
	
	@Test
	public void save(){
		Employee employee1 = new Employee();
		employee1.setName("ye");
		employee1.setHiredate(new Date());
		employee1.setEmail("rw.87@gmx.de");
		employee1.setSalary(200.89);

		Employee employee2 = new Employee();
		employee2.setName("ma");
		employee2.setHiredate(new Date());
		employee2.setEmail("li88@gmx.de");
		employee2.setSalary(490.02);

		Employee employee3 = new Employee();
		employee3.setName("julia");
		employee3.setHiredate(new Date());
		employee3.setEmail("xiao@gmx.de");
		employee3.setSalary(260.19);
		
		
		employeeRepos.save(employee1);
		employeeRepos.save(employee2);
		employeeRepos.save(employee3);
	}
	
	@Test
	public void update(){
		Employee employee = employeeRepos.findOne(1);
		employee.setName("maja-lila");
		employeeRepos.save(employee);
	}

}
