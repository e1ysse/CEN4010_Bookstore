package com.jetbrains.geektext.GeekText.service.impl;

import com.jetbrains.geektext.GeekText.entity.BookInfoEntity;
import com.jetbrains.geektext.GeekText.repository.BookInfoRepository;
import com.jetbrains.geektext.GeekText.service.BookInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookInfoServiceImpl implements BookInfoService {
    private final BookInfoRepository bookInfoRepository;

    public BookInfoServiceImpl(BookInfoRepository bookInfoRepository) {
        this.bookInfoRepository = bookInfoRepository;
    }

    @Override
    public List<BookInfoEntity> findAllBookDetails() {
        return bookInfoRepository.findAll();
    }

    @Override
    public BookInfoEntity findByISBN(Long isbn) {
        return null;
    }

    @Override
    public BookInfoEntity saveBookInfo(BookInfoEntity bookInfoEntity) {
        return null;
    }

    @Override
    public BookInfoEntity updateBookInfo(BookInfoEntity bookInfoEntity) {
        return null;
    }

    @Override
    public void deleteBookInfo(Long isbn) {

    }
}
