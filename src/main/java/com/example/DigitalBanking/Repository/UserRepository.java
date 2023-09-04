package com.example.DigitalBanking.Repository;

import com.example.DigitalBanking.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
