package com.barclays.rest.works.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.barclays.rest.works.entity.Employee;
import com.barclays.rest.works.repo.EmployeeRepository;

//this will be the first class to be loaded
@Configuration
@EnableMongoRepositories(basePackageClasses = EmployeeRepository.class)
public class MongoConfig {
	
	@Bean
	public CommandLineRunner cmdLineRunner(EmployeeRepository repo) {
		//only for first time
//		return string->{
//			repo.insert(new Employee(101,"Harish",50000));	
//			repo.insert(new Employee(102,"Visaka",50000));
//			repo.insert(new Employee(103,"Nitish",50000));
//		};
		return null;
		
	}
	

}
