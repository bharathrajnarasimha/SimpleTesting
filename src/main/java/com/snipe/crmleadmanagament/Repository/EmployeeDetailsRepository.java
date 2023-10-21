package com.snipe.crmleadmanagament.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snipe.crmleadmanagament.Employee.EmployeeDetails;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Long> {

}
