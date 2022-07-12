package com.bank.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.sample.model.Account;
import com.bank.sample.model.request.AccountStatementRequest;
import com.bank.sample.model.request.TransferBalanceRequest;
import com.bank.sample.model.response.Response;
import com.bank.sample.service.AccountService;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/create")
	public List<Account> create(@RequestBody Account account) {
		accountService.save(account);
		return accountService.findAll();
	}

	@GetMapping("/all")
	public List<Account> all() {
		return accountService.findAll();
	}

	@PutMapping("/sendmoney")
	public Response<Object> sendMoney(@RequestBody TransferBalanceRequest transferBalanceRequest) {

		return Response.ok().setPayload(accountService.sendMoney(transferBalanceRequest));
	}

	@PostMapping("/statement")
	public Response<Object> getStatement(@RequestBody AccountStatementRequest accountStatementRequest

	) {
		return Response.ok().setPayload(accountService.getStatement(accountStatementRequest.getAccountNumber()));

	}
}
