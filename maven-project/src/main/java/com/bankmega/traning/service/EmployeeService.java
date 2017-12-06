package com.bankmega.traning.service;
import java.util.Date;
import java.util.List;

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

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployee();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setId(id);
		employeeDao.delete(employee);
	}

	
}
