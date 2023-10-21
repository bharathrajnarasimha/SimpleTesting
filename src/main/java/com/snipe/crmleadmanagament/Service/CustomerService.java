package com.snipe.crmleadmanagament.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snipe.crmleadmanagament.Customer.CustomerLogin;
import com.snipe.crmleadmanagament.Dto.CustomerDto;
import com.snipe.crmleadmanagament.Repository.CustomerAddressRepository;
import com.snipe.crmleadmanagament.Repository.CustomerLoginRepository;

@Service
public class CustomerService {
	
	@Autowired
	public CustomerAddressRepository customerAddressRepository;
	
	@Autowired
	public 	CustomerLoginRepository customerLoginRepository;
	
	public CustomerLogin saveCustomerLogin( CustomerLogin customerLogin)
	{
	 return customerLoginRepository.saveAndFlush(customerLogin);
	}
	
	public CustomerLogin saveCustomerLogins( CustomerLogin customerLogin)
	{
	 return customerLoginRepository.saveAndFlush(customerLogin);
	}
	
	public CustomerLogin findCustomById(long id)
	{
		return customerLoginRepository.getById(id);
	}
	
	/*
	 * public CustomerLogin findCustomByCompanyName(String companyName) { return
	 * customerLoginRepository.findCustomByCompanyName(companyName); }
	 */
	public String deleteById(long id)
	{
		customerLoginRepository.deleteById(id);
		return "The details assocaiated with the customer id is deleted "+id+" sucessfully";
	}
	
	public CustomerLogin updateCustomerLogin(CustomerLogin customerLogin)
	{
		CustomerLogin existingCustomerLogin=customerLoginRepository.getById( customerLogin.getId());
		
		existingCustomerLogin.setCname(customerLogin.getCname());
		existingCustomerLogin.setMobilenumber(customerLogin.getMobilenumber());
		return customerLoginRepository.saveAndFlush(existingCustomerLogin);
	}
	
	
	
	
	}
