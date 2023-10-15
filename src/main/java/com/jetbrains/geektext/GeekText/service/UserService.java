package com.jetbrains.geektext.GeekText.service;


import com.jetbrains.geektext.GeekText.entity.UserEntity;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserEntity> findAllUsers();

    Optional<UserEntity> findByUserID(Long user_ID);

    UserEntity addUser(UserEntity userEntity);
}
