package com.jetbrains.geektext.GeekText.service.impl;

import com.jetbrains.geektext.GeekText.entity.BookInfoEntity;
import com.jetbrains.geektext.GeekText.repository.BookInfoRepository;
import com.jetbrains.geektext.GeekText.service.BookInfoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookInfoServiceImpl implements BookInfoService {
    private final BookInfoRepository bookInfoRepository;

    public BookInfoServiceImpl(BookInfoRepository bookInfoRepository) {
        this.bookInfoRepository = bookInfoRepository;
    }

    @Override
    public List<BookInfoEntity> findAllBookInfo() {
        return bookInfoRepository.findAll();
    }

    @Override
    public Optional<BookInfoEntity> findById(Long id) {
        return bookInfoRepository.findById(id); //maybe treat this like ISBN??
    }

    @Override
    public BookInfoEntity saveBookInfo(BookInfoEntity bookInfoEntity) {
        return bookInfoRepository.save(bookInfoEntity);
    }

    @Override
    public BookInfoEntity updateBookInfo(BookInfoEntity bookInfoEntity) {
        return bookInfoRepository.save(bookInfoEntity);
    }

    @Override
    public void deleteBookInfo(Long id) {
        bookInfoRepository.deleteById(id);
    }
}
