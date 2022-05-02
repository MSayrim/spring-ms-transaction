package com.mfa.springmstransaction.repository;

import com.mfa.springmstransaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITransactionRepository extends JpaRepository<Transaction,Long> {
    List<Transaction> findAllByUserId(Long userId);
}
