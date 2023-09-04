package com.example.DigitalBanking.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name = "transactions", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transactionId")
    private Long transactionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "senderAccountId")
    private BankAccount senderAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "receiverAccountId")
    private BankAccount receiverAccount;

    @Column(name = "amount")
    private double amount;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "transactionDate")
    private Date transactionDate;
}
