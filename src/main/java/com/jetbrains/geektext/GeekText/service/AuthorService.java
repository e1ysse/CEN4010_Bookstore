package com.jetbrains.geektext.GeekText.service;

import com.jetbrains.geektext.GeekText.entity.AuthorEntity;

import java.util.List;

public interface AuthorService {
    List<AuthorEntity> findAllAuthors();
    AuthorEntity getBooksbyAuthorid(Long id);
    AuthorEntity addAuthor(AuthorEntity authorEntity);
}
