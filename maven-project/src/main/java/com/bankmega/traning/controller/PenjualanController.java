package com.bankmega.traning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bankmega.traning.model.Employee;
import com.bankmega.traning.model.Penjualan;
import com.bankmega.traning.service.EmployeeService;
import com.bankmega.traning.service.PenjualanService;

@Controller
@RequestMapping("/penjualan")
public class PenjualanController {

	@Autowired
	EmployeeService employeeService;
	@Autowired
	PenjualanService penjualanService;
	
	@RequestMapping
	public String index(Model model){
		List<Employee> employees = employeeService.getAllEmployee();
		model.addAttribute("employees", employees);
		return "penjualan";
	}
	
	//Receiving data
	@RequestMapping
			(value="/save", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody Penjualan penjualan){
		penjualanService.save(penjualan);
	}
	
	
	
	
	
	
	
}
