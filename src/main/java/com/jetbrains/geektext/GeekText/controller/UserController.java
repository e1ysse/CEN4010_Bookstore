package com.jetbrains.geektext.GeekText.controller;

import com.jetbrains.geektext.GeekText.entity.UserEntity;
import com.jetbrains.geektext.GeekText.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/userInfo")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<UserEntity> findAllUserInfo(){
        return userService.findUserInfo();
    }

    @GetMapping("/{ID}")
    public Optional<UserEntity> findUserInfoByID(@PathVariable("ID") Long id){
        return UserService.findByUserID(id);
    }

    @PostMapping
    public UserEntity addUser(@RequestBody UserEntity userEntity){
        return UserService.addUser(userEntity);
    }
}
