package com.bankmega.traning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankmega.traning.dao.PenjualanDao;
import com.bankmega.traning.model.Penjualan;

@Service
@Transactional
public class PenjualanService {

	@Autowired
	PenjualanDao penjualanDao;
	
	public void save(Penjualan penjualan) {
		// TODO Auto-generated method stub
		penjualanDao.save(penjualan);
	}

}
