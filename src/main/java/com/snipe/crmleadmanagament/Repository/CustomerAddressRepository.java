package com.snipe.crmleadmanagament.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.snipe.crmleadmanagament.Customer.CustomerAddress;

@Repository
public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Long> {

	
	Optional<CustomerAddress> findById(int customer_id);
	
}
