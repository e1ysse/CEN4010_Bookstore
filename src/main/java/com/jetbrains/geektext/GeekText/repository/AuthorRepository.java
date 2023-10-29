package com.jetbrains.geektext.GeekText.repository;

import com.jetbrains.geektext.GeekText.entity.AuthorEntity;
import com.jetbrains.geektext.GeekText.entity.BookInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

}
