package com.mfa.springmstransaction.service;

import com.mfa.springmstransaction.model.Transaction;

import java.util.List;

public interface ITransactionService {
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransactionOfUser(Long userId);
}
