package com.jetbrains.geektext.GeekText.controller;

import com.jetbrains.geektext.GeekText.entity.UserEntity;
import com.jetbrains.geektext.GeekText.repository.UserRepository;
import com.jetbrains.geektext.GeekText.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserEntity> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/{user_ID}")
    public Optional<UserEntity> findByUserID(@PathVariable("user_ID") Long user_ID){
        return userService.findByUserID(user_ID);
    }

    @PostMapping
    public ResponseEntity<Void> addUser(@RequestBody UserEntity userEntity){
        userService.addUser(userEntity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{userId}")
    public ResponseEntity<Void> updateUser(@PathVariable Long userId, @RequestBody UserEntity user) {
        userService.updateUser(userId, user);
        return ResponseEntity.ok().build();
    }
}
