package com.se.springmvc.control;


import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.se.spingmvc.model.Customer;
import com.se.spingmvc.model.CustomerList;

@Controller
public class CustomerControl {
	
	
	
	private CustomerList list = new CustomerList();
	
	@RequestMapping("/")
	public String showForm(Model model) {
		Customer customer = new Customer();
		
		model.addAttribute(customer);
		
		return "customer-form";
	}
	
	//Get Attribute Object Customer from Form
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("customer") Customer cus, Model model) {
		//Add new customer to list
		list.add(cus);
		
		System.out.println(cus);
		
		//Add list to attribute send jsp file
		model.addAttribute("CUSTOMER_LIST", list.getList());
		
		return "customer-confirmation";
	}
	
	
	@RequestMapping("/processFormTwo")
	public String processFormTwo(@ModelAttribute("customer")Customer customer, HttpServletRequest req, HttpServletResponse resp, Model model) throws UnsupportedEncodingException {
		
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("utf-8");
		
		
		System.out.println(customer);
		
		list.add(customer);
		
		model.addAttribute("CUSTOMER_LIST", list.getList());
		
		return "customer-confirmation";
	
	}
}
