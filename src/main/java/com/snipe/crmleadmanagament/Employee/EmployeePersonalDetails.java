package com.snipe.crmleadmanagament.Employee;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

public class EmployeePersonalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	
	private String fatherName;
	private String mothername;
	private String address;
	@Column(length = 6)
	private int pin;
	@Column(length = 10)
	private long mobilenumber;
	
	@OneToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn
	public EmployeeDetails employeeDetails;
	
	
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
	public EmployeePersonalDetails( String fatherName, String mothername, String address, int pin,
			long mobilenumber, EmployeeDetails employeeDetails) {
		super();
		
		this.fatherName = fatherName;
		this.mothername = mothername;
		this.address = address;
		this.pin = pin;
		this.mobilenumber = mobilenumber;
		this.employeeDetails = employeeDetails;
	}
	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}
	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
	
	
	

}
