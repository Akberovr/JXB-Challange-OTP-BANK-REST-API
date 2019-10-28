package com.jxb.challange.otpbank.service.transaction;

import com.jxb.challange.otpbank.entity.Transaction;

import java.util.List;

public interface TransactionService {

    public List<Transaction> findAll();

    public Transaction findById(int theId);

    public void save(Transaction theTransaction);

    public void deleteById(int theId);

}
