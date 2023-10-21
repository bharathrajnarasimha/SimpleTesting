package com.snipe.crmleadmanagament.Dto;

import javax.persistence.Column;

public class EmployeeDto {
	
	
	private long id;
	private String firstname;
	private String lastname;
	@Column(unique = true)
	private String emailid;
	private String doj;
	private String designation;
	private String department;
	private String salary;
	private String fatherName;
	private String mothername;
	private String address;
	@Column(length = 6)
	private int pin;
	@Column(length = 10)
	private long mobilenumber;
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
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public long getId() {
		return id;
	}
	public EmployeeDto(long id, String firstname, String lastname, String emailid, String doj, String designation,
			String department, String salary, String fatherName, String mothername, String address, int pin,
			long mobilenumber) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.doj = doj;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
		this.fatherName = fatherName;
		this.mothername = mothername;
		this.address = address;
		this.pin = pin;
		this.mobilenumber = mobilenumber;
	}
	public EmployeeDto() {
		
	}
	
	

}
