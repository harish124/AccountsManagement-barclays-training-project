package com.barclays.rest.works.contract;

import java.util.List;

import com.barclays.rest.works.entity.Employee;

public interface IEmployeeService {
	public Employee insertEmp(Employee e);
	public List<Employee> getAllEmps();
	public Employee getEmpById(int empId);
	public void deleteEmpById(int empId);
	public Employee updateEmp(Employee e);
	public List<Employee> getSalaryBtw(double min,double max);
	public List<Employee> getByName(String name);
}
