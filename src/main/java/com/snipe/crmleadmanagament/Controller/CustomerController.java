package com.snipe.crmleadmanagament.Controller;

import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.swing.text.DefaultEditorKit.CutAction;
import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snipe.crmleadmanagament.Customer.CustomerAddress;
import com.snipe.crmleadmanagament.Customer.CustomerLogin;
import com.snipe.crmleadmanagament.Dto.CustomerDto;
import com.snipe.crmleadmanagament.Repository.CustomerAddressRepository;
import com.snipe.crmleadmanagament.Repository.CustomerLoginRepository;
import com.snipe.crmleadmanagament.Service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	public CustomerLoginRepository customerLoginRepository;

	@Autowired
	public CustomerAddressRepository customerAddressRepository;

	@PostMapping("/saveCustomer")
	public CustomerLogin addCustomerDetail(@RequestBody CustomerDto customerDto) {

		
		CustomerLogin customerLogin = new CustomerLogin(customerDto.getCname(), customerDto.getCompany_mailId(),
				customerDto.getMobilenumber(), customerDto.getCompany_name());

		customerLogin = customerLoginRepository.saveAndFlush( customerLogin);

		CustomerAddress customerAddress = new CustomerAddress(customerDto.getAddress(),
				customerDto.getCustomerCity(), customerDto.getCustomer_state(), customerDto.getCustomer_pin(),
				customerDto.getCountry(), customerLogin);

		customerAddress = customerAddressRepository.saveAndFlush(customerAddress);

		return customerLogin;
	}

	@GetMapping("/findById/{id}")
	public CustomerDto getDetailsById(@PathVariable long id)
	{
		CustomerLogin customerLoginOptional=customerLoginRepository.getById(id);
		
		Optional<CustomerAddress> customerAddressOptional=customerAddressRepository.findById(id);
		
		CustomerDto customerDto= new CustomerDto();
				
		customerDto.setCname(customerLoginOptional.getCname());
		customerDto.setCompany_mailId(customerLoginOptional.getCompany_mailId());
		customerDto.setAddress(customerAddressOptional.get().getAddress());
		customerDto.setCustomer_state(customerAddressOptional.get().getCustomer_state());		
		
		return customerDto;
		
	}
	
	@DeleteMapping("/deleteById/{id}")	
	public String deleteById(@PathVariable long id)
	{
		

				customerLoginRepository.deleteById(id);
	 customerAddressRepository.deleteById(id);;
	 return "the details associated with the id "+id+" is deleted";
			
	}
	
	@PutMapping("/update")
	public CustomerLogin updateById(@RequestBody CustomerDto customerDto) throws Exception
	{
		CustomerLogin existingCustomerLogin=customerLoginRepository.getById(customerDto.getC_id());
		
		
		existingCustomerLogin.setCompany_mailId(customerDto.getCompany_mailId());
		existingCustomerLogin.setMobilenumber(customerDto.getMobilenumber());
		existingCustomerLogin=customerLoginRepository.save(existingCustomerLogin);
		
		CustomerAddress customerAddress=customerAddressRepository.getById(customerDto.getC_id());		
		customerAddress.setAddress(customerDto.getAddress());
		customerAddress.setCustomer_pin(customerDto.getCustomer_pin());
		
		customerAddress=customerAddressRepository.save(customerAddress);
		return existingCustomerLogin;
		
		
	}
	
}
