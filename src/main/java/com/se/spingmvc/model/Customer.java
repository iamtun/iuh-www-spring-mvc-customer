package com.se.spingmvc.model;

import java.util.LinkedHashMap;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String sex;
	private String address;
	private String email;
	
	private LinkedHashMap<String, String> genderOptions;
	

	public Customer() {
		genderOptions = new LinkedHashMap<String, String>();
		genderOptions.put("Nữ", "Nữ");
		genderOptions.put("Nam", "Nam");
	}
	
	public LinkedHashMap<String, String> getGenderOptions() {
		return genderOptions;
	}

	public void setGenderOptions(LinkedHashMap<String, String> genderOptions) {
		this.genderOptions = genderOptions;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSex() {
		return sex;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", sex=" + sex
				+ ", address=" + address + ", email=" + email +  "]";
	}
	
	
	
	
}
