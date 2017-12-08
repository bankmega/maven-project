package com.bankmega.traning.service;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bankmega.traning.model.Employee;

@Component
public class InitDB {

	@Autowired
	EmployeeService employeeService;
	
	
	@PostConstruct
	public void init(){
		
	}
	
}
