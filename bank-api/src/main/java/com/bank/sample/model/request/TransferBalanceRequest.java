package com.bank.sample.model.request;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransferBalanceRequest {
	private String fromAccountNumber;
	private String toAccountNumber;
	private BigDecimal amount;
}
