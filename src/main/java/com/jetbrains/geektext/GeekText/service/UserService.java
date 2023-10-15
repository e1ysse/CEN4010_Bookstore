package com.jetbrains.geektext.GeekText.service;

import com.jetbrains.geektext.GeekText.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserEntity> findUserInfo();
    Optional<UserEntity> findByUserID(Long ID);


    UserEntity addUser(UserEntity userEntity);
}
