package com.barclays.rest.works.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.rest.works.entity.Employee;
import com.barclays.rest.works.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@GetMapping("/")
	public String health() {
		return "I'm Healthy";
	}
	
	@GetMapping("/new-emp")
	public Employee getEmployee(){
		return service.newEmp(101,"Harish",50000);		
	}
	
	@GetMapping("/emp/{empId}")
	public Employee getEmployee(@PathVariable("empId") int empId){
		return service.getEmpById(empId);
	}
	
	@PostMapping("/insert")
	public Employee insertEmployee(@RequestBody Employee e){
		return service.insertEmp(e);
	}
	
	@PostMapping("/update")
	public Employee updateEmployee(@RequestBody Employee e){
		return service.updateEmp(e);
	}
	
	@DeleteMapping("/deleteId/{empId}")
	public Map<String,Boolean> deleteEmployee(@PathVariable("empId") int empId){
		Map<String, Boolean> response = new HashMap<>();
	    
	     
		if(service.getEmpById(empId)!=null) {
			service.deleteEmpById(empId);
			response.put("deleted", true);
			return response;
		}
		else{
			response.put("Employee with id = "+empId+" does not exists", true);
			return response;
		}
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees(){
		return service.getAllEmps();
		
	}
	
	@GetMapping("/empName/{name}")
	public List<Employee> getByName(@PathVariable("name") String name){
		return service.getByName(name);
		
	}
	
	@GetMapping("/salary")
	public List<Employee> getSalary(@RequestParam("min") double min,
			@RequestParam("max") double max){
		return service.getSalaryBtw(min,max);
		
	}
	
	
}
