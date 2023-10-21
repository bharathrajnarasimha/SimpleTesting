package com.snipe.crmleadmanagament.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employeedetails")

@AllArgsConstructor
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstname;
	private String lastname;
	@Column(unique = true)
	private String emailid;
	private String doj;
	private String designation;
	private String department;
	private String salary;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public EmployeeDetails(String firstname, String lastname, String emailid, String doj, String designation,
			String department, String salary) {
		super();
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.doj = doj;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}
	public EmployeeDetails() {
		super();
	}
	
	

}
