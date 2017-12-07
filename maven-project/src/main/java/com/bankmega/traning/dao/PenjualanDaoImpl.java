package com.bankmega.traning.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bankmega.traning.model.Penjualan;

@Repository
public class PenjualanDaoImpl implements PenjualanDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public void save(Penjualan penjualan) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(penjualan);
		session.flush();
	}

}
