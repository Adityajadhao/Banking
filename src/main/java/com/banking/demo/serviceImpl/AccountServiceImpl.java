package com.banking.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.demo.entities.AccountDetails;
import com.banking.demo.repository.AccountDetailsRepository;
import com.banking.demo.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountDetailsRepository accountDetailsRepository;

	@Override
	public AccountDetails fetchAccountDetails(String accountNumber) {
		// TODO Auto-generated method stub
		return accountDetailsRepository.fetchAccountDetails(accountNumber);
	}

	@Override
	public int updateAccountBalance(long accountBalance, String updatedDate, String accountNumber) {
		// TODO Auto-generated method stub
		return accountDetailsRepository.updateAccountBalance(accountBalance, updatedDate, accountNumber);
	}


}
