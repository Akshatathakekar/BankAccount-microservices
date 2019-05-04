package com.capgemini.bankapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="CurrentAccount")  
@PrimaryKeyJoinColumn(name="ID") 
public class CurrentAccount extends BankAccount {

	@Column(name="limit")
	private double limit;

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}


	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String accountHolderName, double balance, String accountType,double limit){
		super(accountHolderName, balance, accountType);
		this.limit = limit;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CurrentAccount [limit=" + limit + "]";
	}


	
}
