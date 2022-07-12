package com.bank.sample.service;

import java.util.List;

import com.bank.sample.model.Account;
import com.bank.sample.model.Transaction;
import com.bank.sample.model.request.AccountStatement;
import com.bank.sample.model.request.TransferBalanceRequest;

public interface AccountService {
	List<Account> findAll();

	Account save(Account account);

	Transaction sendMoney(TransferBalanceRequest transferBalanceRequest);

	AccountStatement getStatement(String accountNumber);
}
