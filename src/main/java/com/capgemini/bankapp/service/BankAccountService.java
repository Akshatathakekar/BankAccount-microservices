package com.capgemini.bankapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capgemini.bankapp.entity.BankAccount;

@Service
public interface BankAccountService {
	
	public List<BankAccount> getAllDetails(BankAccount account);
	public  Optional<BankAccount> getById(int id);
	public boolean updateDetails(int id);
	public boolean deleteDetails(int id);
	public BankAccount addAccount(BankAccount account);

}
