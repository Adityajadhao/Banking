package com.banking.demo.service;

import java.util.List;

import com.banking.demo.entities.AccountDetails;
import com.banking.demo.entities.CustomerEntity;

public interface CustomerService {

	CustomerEntity registerCustomer(CustomerEntity cust);

	List<CustomerEntity> getAllCustomer();
	
	CustomerEntity findUserByEmails(String email);

	AccountDetails addAccountDetails(AccountDetails accountDetails);

	CustomerEntity findUserByAccount(String accountNumber);

	CustomerEntity findUserById(long customerId);

	int updateCustomer(String firstName, String middleName, String lastName, String address, long customerId);

	
	


}
