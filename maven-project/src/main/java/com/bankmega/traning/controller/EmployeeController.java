package com.bankmega.traning.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bankmega.traning.model.Employee;
import com.bankmega.traning.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping
	public String index(Model model){
		
		List<Employee> employees = employeeService.getAllEmployee();
		model.addAttribute("employees", employees);
		
		return "employee";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes){
			employeeService.save(employee);
			redirectAttributes.
				addFlashAttribute("message", employee.getName() +										" berhasil di simpan");
		return "redirect:/employee";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable int id){
		employeeService.delete(id);
	}
	
	
}
