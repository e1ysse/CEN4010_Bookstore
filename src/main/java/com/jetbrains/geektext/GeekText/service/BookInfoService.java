package com.jetbrains.geektext.GeekText.service;

import com.jetbrains.geektext.GeekText.entity.BookInfoEntity;

import java.util.List;
import java.util.Optional;

public interface BookInfoService {
    List<BookInfoEntity> findAllBookInfo();
    Optional<BookInfoEntity> findByISBN(Long isbn); //I thought I'd use isbn, but it wont let me in bookinfoserviceimpl
    //additonally, long and Long are different... I've been using long, so i changed all to Long
    //oh by adding @Id in entity, it seems to have renamed isbn to id.. the method should still work
    BookInfoEntity addBook(BookInfoEntity bookInfoEntity); //lowercase?
}
