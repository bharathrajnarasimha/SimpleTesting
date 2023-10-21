package com.snipe.crmleadmanagament.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snipe.crmleadmanagament.Dto.EmployeeDto;
import com.snipe.crmleadmanagament.Employee.EmployeeDetails;
import com.snipe.crmleadmanagament.Employee.EmployeePersonalDetails;
import com.snipe.crmleadmanagament.Repository.EmployeeDetailsRepository;
import com.snipe.crmleadmanagament.Repository.EmployeePersonalDetailsRepository;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeDetailsRepository employeeDetailsRepository;

	@Autowired
	public EmployeePersonalDetailsRepository employeePersonalDetailsRepository;

	@PostMapping("/saveEmplDetails")
	public EmployeeDetails saveEmployeeDetail(EmployeeDto employeeDto) {
		EmployeeDetails employeeDetails = new EmployeeDetails(employeeDto.getFirstname(), employeeDto.getLastname(),
				employeeDto.getEmailid(), employeeDto.getDepartment(), employeeDto.getDesignation(),
				employeeDto.getDoj(), employeeDto.getSalary());
		employeeDetails = employeeDetailsRepository.saveAndFlush(employeeDetails);

		EmployeePersonalDetails employeePersonalDetails = new EmployeePersonalDetails(employeeDto.getFatherName(),
				employeeDto.getMothername(), employeeDto.getAddress(), employeeDto.getPin(),
				employeeDto.getMobilenumber(), employeeDetails);
		employeePersonalDetails = employeePersonalDetailsRepository.saveAndFlush(employeePersonalDetails);

		return employeeDetails;
	}

}
