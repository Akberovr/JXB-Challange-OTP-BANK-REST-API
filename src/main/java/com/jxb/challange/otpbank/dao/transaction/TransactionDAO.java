package com.jxb.challange.otpbank.dao.transaction;

import com.jxb.challange.otpbank.entity.Transaction;

import java.util.List;

public interface TransactionDAO {


    public List<Transaction> findAll();

    public Transaction findById(int theId);

    public void save(Transaction theTransaction);

    public void deleteById(int theId);

}
