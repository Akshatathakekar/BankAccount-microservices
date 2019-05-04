package com.capgemini.bankapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="SavingAccount")  
@PrimaryKeyJoinColumn(name="ID") 
public class SavingAccount extends BankAccount{
	
	@Column(name="salaryAccount")
	private boolean salaryAccount;

	public SavingAccount(boolean salaryAccount) {
		super();
		this.salaryAccount = salaryAccount;
	}

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(String accountHolderName, double balance, String accountType) {
		super(accountHolderName, balance, accountType);
		// TODO Auto-generated constructor stub
	}

	public boolean isSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}

	@Override
	public String toString() {
		return "SavingAccount [salaryAccount=" + salaryAccount + "]";
	}
	


}
