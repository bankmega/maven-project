package com.bankmega.traning.service;

import java.util.List;

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

	public List<Penjualan> getAllPenjualan() {
		// TODO Auto-generated method stub
		return penjualanDao.getAllPenjualan();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		Penjualan penjualan = new Penjualan();
		penjualan.setId(id);
		penjualanDao.delete(penjualan);
	}

	public Penjualan getPenjualanById(int id) {
		// TODO Auto-generated method stub
		
		return penjualanDao.getPenjualanById(id);
	}

}
