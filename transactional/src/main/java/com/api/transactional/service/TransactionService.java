package com.api.transactional.service;

import org.springframework.stereotype.Service;

import com.api.transactional.dto.TransactionDto;

@Service
public interface TransactionService {
	String saveTransaction(TransactionDto transDto);

}
