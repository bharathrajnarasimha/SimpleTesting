package com.snipe.crmleadmanagament.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snipe.crmleadmanagament.Dto.EmployeeDto;
import com.snipe.crmleadmanagament.Employee.EmployeeDetails;
import com.snipe.crmleadmanagament.Repository.EmployeeDetailsRepository;



@Service
public class EmployeeService {

	@Autowired
	public EmployeeDetailsRepository employeeDetailsRepository;
	
	
	public EmployeeDetails saveEmployeedetails(EmployeeDetails employeeDetails)
	{
		return employeeDetailsRepository.save(employeeDetails);
	}
	
	public EmployeeDetails findById(long id)
	{
		return employeeDetailsRepository.getById(id);
	}
	
	
	public String  deleteById(long id)
	{
	 employeeDetailsRepository.getById(id);
	
	 return "the details associated with the id "+id+" is deleted";
	
	}
	
	
	public EmployeeDetails updateEmployeeDetails(EmployeeDetails details)
	
	{
		 EmployeeDetails existingEmployeeDetails= employeeDetailsRepository.getById(details.getId());
		 
		/*
		 * existingEmployeeDetails.setDesignation(details.getDesignation());
		 * existingEmployeeDetails.setDepartment(details.getDepartment());
		 * existingEmployeeDetails.setDesignation(details.getDesignation());
		 */
		 
		 return  employeeDetailsRepository.saveAndFlush(existingEmployeeDetails);
	}
	
}
