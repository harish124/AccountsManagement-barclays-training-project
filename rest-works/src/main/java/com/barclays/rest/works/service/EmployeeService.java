package com.barclays.rest.works.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.rest.works.contract.IEmployeeService;
import com.barclays.rest.works.entity.Employee;
import com.barclays.rest.works.repo.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public EmployeeService() {
		// TODO Auto-generated constructor stub
	}

	public Employee newEmp(int id,String name,int salary) {
		return new Employee(id,name,salary);
	}

	@Override
	public Employee insertEmp(Employee e) {
		return repo.insert(e);
	}
	
	@Override
	public Employee updateEmp(Employee e) {
		return repo.save(e);		
	}

	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

	@Override
	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
		try {
			return repo.findById(empId).get();
		}
		catch (Exception e) {
			System.out.println("Exception in getting EmpId  = "+empId +"\n"+e.getMessage());
			return null;
		}
	}

	@Override
	public void deleteEmpById(int empId) {
		// TODO Auto-generated method stub
		repo.deleteById(empId);
	}

	@Override
	public List<Employee> getSalaryBtw(double min, double max) {
		
		return repo.getSalaryBtw(min, max);
	}

	@Override
	public List<Employee> getByName(String name) {
		
		return repo.findByEmpName(name);
	}	
}
