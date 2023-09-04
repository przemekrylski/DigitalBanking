package com.example.DigitalBanking.Repository;

import com.example.DigitalBanking.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
