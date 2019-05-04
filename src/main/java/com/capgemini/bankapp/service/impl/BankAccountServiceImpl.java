package com.capgemini.bankapp.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.entity.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;

@Service
public class BankAccountServiceImpl implements BankAccountService{

	@Autowired
	private BankAccountDao dao;

	@Override
	public BankAccount getAllDetails(BankAccount account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankAccount getById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void updateDetails(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDetails(int id) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public BankAccount addAccount(BankAccount account) {
		// TODO Auto-generated method stub
		return dao.save(account);
	}




}
