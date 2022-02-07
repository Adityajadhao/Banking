package com.banking.demo.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.banking.demo.entities.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{

	@Query("SELECT c FROM CustomerEntity c WHERE c.emailId = ?1")
	CustomerEntity findUserByEmails(String email);

	@Query("SELECT c FROM CustomerEntity c WHERE c.accountNumber = ?1")
	CustomerEntity findUserByAccount(String accountNumber);
	
	
	@Query("SELECT c FROM CustomerEntity c WHERE c.customerId = ?1")
	CustomerEntity findUserById(long customerId);

	@Modifying
	@Transactional
	@Query("UPDATE CustomerEntity a SET a.firstName = ?1, a.middleName = ?2 ,a.lastName= ?3,a.address= ?4 WHERE a.customerId = ?5")
	int updateCustomer(String firstName, String middleName, String lastName, String address, long customerId);
}
