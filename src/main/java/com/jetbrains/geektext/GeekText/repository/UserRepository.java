package com.jetbrains.geektext.GeekText.repository;

import com.jetbrains.geektext.GeekText.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
