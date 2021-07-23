package com.api.transactional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.transactional.dto.TransactionDto;
import com.api.transactional.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	TransactionService transService;
	
	@PostMapping("/transactions")
	public String applyforcreadit(@RequestBody TransactionDto transDto){
		
		return transService.saveTransaction(transDto);
	}
	

}
