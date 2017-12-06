package com.bankmega.traning.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bankmega.traning.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(employee);
		session.flush();
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Employee> employees = 
		session.createCriteria(Employee.class).list();
		if(employees.isEmpty()){
			return null;
		}
		return employees;
	}

	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		employee.setName("*");
		Session session = sessionFactory.getCurrentSession();
		session.delete(employee);
		session.flush();
	}

	


}
