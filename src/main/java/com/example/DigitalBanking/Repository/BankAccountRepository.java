package com.example.DigitalBanking.Repository;

import com.example.DigitalBanking.Model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
