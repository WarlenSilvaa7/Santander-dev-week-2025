package me.dio.Santander_dev_week_2025.service;

import me.dio.Santander_dev_week_2025.model.User;
import me.dio.Santander_dev_week_2025.repository.UserRepository;

import java.util.NoSuchElementException;

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByaccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account number alredy exists.");
        }
        return userRepository.save(userToCreate);
    }
}
