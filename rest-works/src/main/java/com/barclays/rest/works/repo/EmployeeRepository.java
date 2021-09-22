package com.barclays.rest.works.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.barclays.rest.works.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer>{

	List<Employee> findByEmpName(String name);
	
	
	@Query(value= "{'salary': {$gt:?0,$lt:?1}}")
	List<Employee> getSalaryBtw(double min,double max);

	

}
