package com.bankmega.traning.dao;

import java.util.List;

import com.bankmega.traning.model.Penjualan;

public interface PenjualanDao {

	void save(Penjualan penjualan);

	List<Penjualan> getAllPenjualan();

	void delete(Penjualan penjualan);

	Penjualan getPenjualanById(int id);

}
