package me.dio.Santander_dev_week_2025.repository;

import me.dio.Santander_dev_week_2025.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByaccountNumber(String accountNumber);
}
