package com.bankmega.traning.service;
import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankmega.traning.dao.EmployeeDao;
import com.bankmega.traning.model.Employee;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	public void save(Employee employee){
		employeeDao.save(employee);
	}
	
}
