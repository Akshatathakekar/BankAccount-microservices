package com.capgemini.bankapp.service;

import com.capgemini.bankapp.entity.BankAccount;

public interface BankAccountService {
	
	public BankAccount getAllDetails(BankAccount account);
	public  BankAccount getById(int id);
	public void updateDetails(int id);
	public void deleteDetails(int id);
	public BankAccount addAccount(BankAccount account);

}
