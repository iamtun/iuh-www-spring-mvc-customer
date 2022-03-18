package com.se.spingmvc.model;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
	private List<Customer> listCustomer;

	
	public CustomerList() {
		this.listCustomer = new ArrayList<Customer>();
	}
	
	public List<Customer> getListCustomer() {
		return listCustomer;
	}

	
	public List<Customer> getList() {
		return listCustomer;
	}
	
	public boolean add(Customer cus) {
		if(listCustomer.contains(cus)) {
			return false;
		}
		
		listCustomer.add(cus);
		return true;
	}
	
	
}
