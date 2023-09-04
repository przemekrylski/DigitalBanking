package com.example.DigitalBanking.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Entity
@Data
@Table(name = "bank_accounts", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountId")
    private Long accountId;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Column(name = "balance")
    private double balance;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    @PrePersist
    private void generateAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumberBuilder = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            accountNumberBuilder.append(random.nextInt(10));
        }
        this.accountNumber = accountNumberBuilder.toString();
    }
}