package com.bankmega.traning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Penjualan {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="no_penjualan")
	private String noPenjualan;
	private String location;
	@Column(name="total_harga")
	private Double totalHarga;
	@ManyToOne
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNoPenjualan() {
		return noPenjualan;
	}
	public void setNoPenjualan(String noPenjualan) {
		this.noPenjualan = noPenjualan;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getTotalHarga() {
		return totalHarga;
	}
	public void setTotalHarga(Double totalHarga) {
		this.totalHarga = totalHarga;
	}
	
	
}
