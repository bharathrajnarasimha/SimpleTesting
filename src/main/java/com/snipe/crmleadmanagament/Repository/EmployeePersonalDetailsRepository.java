package com.snipe.crmleadmanagament.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snipe.crmleadmanagament.Employee.EmployeePersonalDetails;


@Repository
public interface EmployeePersonalDetailsRepository extends JpaRepository<EmployeePersonalDetailsRepository, Long> {

	EmployeePersonalDetails saveAndFlush(EmployeePersonalDetails employeePersonalDetails);

}
