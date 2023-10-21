package com.snipe.crmleadmanagament.Customer;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@Entity
@Table(name = "CustomerAddress")
public class CustomerAddress {

	@Id	
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	@OneToOne(cascade = CascadeType.ALL )
	@JoinColumn 
	@OnDelete(action = OnDeleteAction.CASCADE)
	private CustomerLogin cutsomerLogin;



	public CustomerAddress( ) {
		super();

	}

	public CustomerAddress(String address, String customerCity, String customer_state, String customer_pin,
			String country, CustomerLogin customerLogin) {
		super();
		this.address = address;
		this.customerCity = customerCity;
		this.customer_state = customer_state;
		this.customer_pin = customer_pin;
		this.country = country;
		this.cutsomerLogin = customerLogin;
	}

	public CustomerLogin getCutsomerLogin() {
		return cutsomerLogin;
	}

	public void setCutsomerLogin(CustomerLogin cutsomerLogin) {
		this.cutsomerLogin = cutsomerLogin;
	}

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String customerCity;

	@Column(name = "state")
	private String customer_state;

	@Column(name = "country")
	private String country;

	@Column(name = "pin", length = 6)
	private String customer_pin;

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
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCustomer_pin() {
		return customer_pin;
	}

	public void setCustomer_pin(String customer_pin) {
		this.customer_pin = customer_pin;
	}

	public long getId() {
		return id;
	}

}
