package com.jetbrains.geektext.GeekText.service.impl;

import com.jetbrains.geektext.GeekText.entity.AuthorEntity;
import com.jetbrains.geektext.GeekText.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
//FIXME go to video 19:06. where you left off
@Service
public class AuthorServiceImpl implements AuthorService {

    @Override
    public List<AuthorEntity> findAllAuthors() {
        return null;
    }

    @Override
    public AuthorEntity getBooksbyAuthorid(Long id) {
        return null;
    }

    @Override
    public AuthorEntity addAuthor(AuthorEntity authorEntity) {
        return null;
    }
}
