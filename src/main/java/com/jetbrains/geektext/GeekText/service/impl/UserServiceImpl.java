package com.jetbrains.geektext.GeekText.service.impl;

import com.jetbrains.geektext.GeekText.entity.UserEntity;
import com.jetbrains.geektext.GeekText.repository.UserRepository;
import com.jetbrains.geektext.GeekText.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public List<UserEntity> findUserInfo() {
        return null;
    }

    @Override
    public Optional<UserEntity> findByUserID(Long ID) {
        return UserRepository.findById(ID);
    }

    @Override
    public UserEntity addUser(UserEntity userEntity) {
        return null;
    }
}
