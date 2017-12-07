package com.bankmega.traning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bankmega.traning.model.Employee;
import com.bankmega.traning.service.EmployeeService;

@Controller
@RequestMapping("/penjualan")
public class PenjualanController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping
	public String index(Model model){
		List<Employee> employees = employeeService.getAllEmployee();
		model.addAttribute("employees", employees);
		return "penjualan";
	}
}
