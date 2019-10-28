package com.jxb.challange.otpbank.service.transaction;

import com.jxb.challange.otpbank.dao.transaction.TransactionDAO;
import com.jxb.challange.otpbank.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    TransactionDAO transactionDAO;

    public TransactionServiceImpl(TransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }

    @Override
    public List<Transaction> findAll() {
        return transactionDAO.findAll();
    }

    @Override
    public Transaction findById(int theId) {
        return transactionDAO.findById(theId);
    }

    @Override
    public void save(Transaction theTransaction) {
        transactionDAO.save(theTransaction);
    }

    @Override
    public void deleteById(int theId) {
        transactionDAO.deleteById(theId);
    }
}
