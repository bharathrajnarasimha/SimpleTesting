package com.snipe.crmleadmanagament.Customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.OnDelete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data

@AllArgsConstructor
@Table(name="CustomerDetails")
public class CustomerLogin {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)	
	private long id;
	
	@Column(name="customer_name")
	private String cname;

	@Column(name="customer_mobile_number",unique = true)	
	private String mobilenumber;
	
	@Column(name="Customer_company_name")
	private String company_name;
	
	@Column(name="Customer_company_email", unique = true )	
	@NonNull
	//@Pattern(regexp="^([a-zA-Z0-9\\-\\.\\_]+)'+'(\\@)([a-zA-Z0-9\\-\\.]+)'+'(\\.)([a-zA-Z]{2,4})$")
	private String company_mailId;
		
	
	public CustomerLogin() {
		super();
	}



	public CustomerLogin(String cname, String mobilenumber,
			String company_name,
			@NonNull @Pattern
			(regexp = "^([a-zA-Z0-9\\-\\.\\_]+)'+'(\\@)([a-zA-Z0-9\\-\\.]+)'+'(\\.)([a-zA-Z]{2,4})$") String company_mailId
			) 
	{
		super();
		
		
		this.cname = cname;
		this.mobilenumber = mobilenumber;
		this.company_name = company_name;
		this.company_mailId = company_mailId;
	}


	
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_mailId() {
		return company_mailId;
	}

	public void setCompany_mailId(String company_mailId) {
		this.company_mailId = company_mailId;
	}

	

	public long getId() {
		return id;
	}

	
	
	
	
}
