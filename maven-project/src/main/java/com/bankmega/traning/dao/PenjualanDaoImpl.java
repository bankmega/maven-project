package com.bankmega.traning.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

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

	public List<Penjualan> getAllPenjualan() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		/*
		 * String hql = "from Penjualan";
		 * List<penjualan> penjualan = session.createQuery(hql).list();
		 * */
		List<Penjualan> penjualan = session.createCriteria(Penjualan.class).list();
		
		return penjualan;
	}

	public void delete(Penjualan penjualan) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(penjualan);
		session.flush();
	}

}
