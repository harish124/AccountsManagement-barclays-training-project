package com.barclays.rest.works;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.Mockito.*; //needed for when
import com.barclays.rest.works.contract.IEmployeeService;
import com.barclays.rest.works.entity.Employee;
import com.barclays.rest.works.repo.EmployeeRepository;

@SpringBootTest
class RestWorksApplicationTests {

//	@MockBean
//	private EmployeeRepository repo; 
//	
//	@Autowired
//	private IEmployeeService service;
//	
//	
//	@Test
//	void insertEmpTest() {
//		Employee e=new Employee(101,"Harish",1234);
//		
//		when(repo.save(e)).thenReturn(e);
//		assertEquals("Harish",service.insertEmp(e).getEmpName());
//	}

}


