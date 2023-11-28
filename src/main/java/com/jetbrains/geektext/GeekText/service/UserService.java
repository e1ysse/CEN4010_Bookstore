package com.jetbrains.geektext.GeekText.service;

import com.jetbrains.geektext.GeekText.entity.UserEntity;
import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserEntity> findAllUsers();
    Optional<UserEntity> findByUserID(Long user_ID);
    void addUser(UserEntity userEntity);
    void updateUser(String username, UserEntity updatedUser);
    Optional<UserEntity> findByUsername(String username);
    void deleteUser(Long userId);
    void updateUser(Long userId, UserEntity user);

}
