package com.jetbrains.geektext.GeekText.service.impl;

import com.jetbrains.geektext.GeekText.entity.AuthorEntity;
import com.jetbrains.geektext.GeekText.entity.BookInfoEntity;
import com.jetbrains.geektext.GeekText.repository.AuthorRepository;
import com.jetbrains.geektext.GeekText.repository.BookInfoRepository;
import com.jetbrains.geektext.GeekText.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    private final BookInfoRepository bookInfoRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository, BookInfoRepository bookInfoRepository) {
        this.authorRepository = authorRepository;
        this.bookInfoRepository = bookInfoRepository;
    }

    @Override
    public List<AuthorEntity> findAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<BookInfoEntity> getBooksbyAuthorid(Long id) {
        Optional<AuthorEntity> auth = authorRepository.findById(id);
        String name = auth.get().getFirst_name() + " " + auth.get().getLast_name();
        return bookInfoRepository.findAllByAuthor(name);
    }

    @Override
    public AuthorEntity addAuthor(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }
}
