package com.banking.demo.service;

import com.banking.demo.entities.AccountDetails;

public interface AccountService {

	AccountDetails fetchAccountDetails(String accountNumber);

	int updateAccountBalance(long accountBalance, String updatedDate, String accountNumber);


}
