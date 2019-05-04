package com.capgemini.bankapp.controller;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bankapp.entity.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;

@RestController
public class BankAppController {

    private static final Logger logger = LogManager.getLogger(BankAppController.class);

	@Autowired
	private BankAccountService service;
	
	@GetMapping("/accounts")
	public void getAllDetails()
	{
		
	}
	
	@GetMapping("/account/{id}")
	public Optional<BankAccount> getAccountById(@PathVariable int id)
	{
		return service.getById(id);
//		.map(account->{
//			3
		
//			try {
//				return ResponseEntity.ok();
////						.eTag(Integer.toString(account.getVersion()))
////						.location(new URI("/account/"+account.getId()))
//						
//			}catch (URISyntaxException e ) {
//                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//            }
//			
//		}).orElse(ResponseEntity.notFound().build());

		
	}
	
	 @PostMapping("/account")                                                                                                                                                                                    
	public ResponseEntity<BankAccount> createAccount(@RequestBody BankAccount account)
	{
		return new ResponseEntity<BankAccount>(service.addAccount(account), HttpStatus.CREATED);
		
	}
	
	 @DeleteMapping("")
	 public void deleteAccount()
	 {
		 
	 }
	 
	 @PutMapping("")
	 public void updateAccount()
	 {
		 
	 }
}
