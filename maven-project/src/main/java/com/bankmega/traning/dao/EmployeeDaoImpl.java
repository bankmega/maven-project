package com.bankmega.traning.dao;

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


}
