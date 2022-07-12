package com.bank.sample.model.request;

import java.math.BigDecimal;
import java.util.List;

import com.bank.sample.model.Transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountStatement {
	BigDecimal currentBalance;
	List<Transaction> transactionHistory;
}
