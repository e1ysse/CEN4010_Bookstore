package com.jetbrains.geektext.GeekText.service;

import com.jetbrains.geektext.GeekText.entity.AuthorEntity;
import com.jetbrains.geektext.GeekText.entity.BookInfoEntity;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<AuthorEntity> findAllAuthors();
    Optional<BookInfoEntity> getBooksbyAuthorid(Long id);
    AuthorEntity addAuthor(AuthorEntity authorEntity);
}
