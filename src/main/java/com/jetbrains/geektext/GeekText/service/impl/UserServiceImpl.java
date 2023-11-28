package com.jetbrains.geektext.GeekText.service.impl;

import com.jetbrains.geektext.GeekText.entity.UserEntity;
import com.jetbrains.geektext.GeekText.repository.UserRepository;
import com.jetbrains.geektext.GeekText.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> findByUserID(Long user_ID) {
        return userRepository.findById(user_ID);
    }

    @Override
    public void addUser(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    @Override
    public void updateUser(String username, UserEntity updatedUser) {
        Optional<UserEntity> userOptional = userRepository.findByUsername(username);
        if(userOptional.isPresent()){
            UserEntity user = userOptional.get();
            user.setName(updatedUser.getName());
            user.setPassword(updatedUser.getPassword());
            // Update other fields as necessary
            userRepository.save(user);
        }
    }

    @Override
    public Optional<UserEntity> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public void updateUser(Long userId, UserEntity updatedUser) {
        UserEntity user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (updatedUser.getUsername() != null) user.setUsername(updatedUser.getUsername());
        if (updatedUser.getPassword() != null) user.setPassword(updatedUser.getPassword());
        if (updatedUser.getName() != null) user.setName(updatedUser.getName());

        userRepository.save(user);
    }
}
