package com.mfa.springmstransaction.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id",nullable = false)
    private Long userId;

    @Column(name = "product_id",nullable = false)
    private Long productId;

    @Column(name = "transaction_time")
    private LocalDateTime transactionTime;
}
