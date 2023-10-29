package com.jetbrains.geektext.GeekText.service.impl;

import com.jetbrains.geektext.GeekText.entity.AuthorEntity;
import com.jetbrains.geektext.GeekText.repository.AuthorRepository;
import com.jetbrains.geektext.GeekText.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<AuthorEntity> findAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<AuthorEntity> getBooksbyAuthorid(Long id) { //fixme to find books
        return authorRepository.findById(id);
    }

    @Override
    public AuthorEntity addAuthor(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }
}
