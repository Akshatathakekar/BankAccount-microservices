package com.capgemini.bankapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.entity.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;

@Service
public class BankAccountServiceImpl implements BankAccountService{

	@Autowired
	private BankAccountDao dao;

	@Override
	public List<BankAccount> getAllDetails(BankAccount account) {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<BankAccount> getById(int id) {
		return dao.findById(id);
	}

	

	
	@Override
	public BankAccount addAccount(BankAccount account) {
		// TODO Auto-generated method stub
		return dao.save(account);
	}

	@Override
	public boolean updateDetails(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDetails(int id) {
		// TODO Auto-generated method stub
		return false;
	}




}
