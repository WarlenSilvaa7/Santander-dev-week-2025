package me.dio.Santander_dev_week_2025.service;

import me.dio.Santander_dev_week_2025.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
