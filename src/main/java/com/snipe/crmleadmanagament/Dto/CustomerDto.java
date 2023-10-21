package com.snipe.crmleadmanagament.Dto;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;


import com.snipe.crmleadmanagament.Customer.CustomerLogin;

public class CustomerDto {

	private long c_id;

	private String customerCity;

	private String customer_state;

	private String Country;

	private String customer_pin;

	private String cname;

	private String mobilenumber;

	private String company_name;

	private String company_mailId;	
	
	private String	address;
	
	

	public CustomerDto(String customerCity, String customer_state, String country, String customer_pin, String cname,
			String mobilenumber, String company_name, String company_mailId, String address) {
		super();
		this.customerCity = customerCity;
		this.customer_state = customer_state;
		this.Country = country;
		this.customer_pin = customer_pin;
		this.cname = cname;
		this.mobilenumber = mobilenumber;
		this.company_name = company_name;
		this.company_mailId = company_mailId;
		this.address = address;
	}

	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomer_state() {
		return customer_state;
	}

	public void setCustomer_state(String customer_state) {
		this.customer_state = customer_state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getCustomer_pin() {
		return customer_pin;
	}

	public void setCustomer_pin(String customer_pin) {
		this.customer_pin = customer_pin;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCompany_mailId() {
		return company_mailId;
	}

	public void setCompany_mailId(String company_mailId) {
		this.company_mailId = company_mailId;
	}

	public long getC_id() {
		return c_id;
	}

}
