package com.jetbrains.geektext.GeekText.service;

import com.jetbrains.geektext.GeekText.entity.BookInfoEntity;

import java.util.List;

public interface BookInfoService {
    List<BookInfoEntity> findAllBookDetails();
    BookInfoEntity findByISBN(Long isbn); //I'm assuming we use the PK datatype, as shown in the database
    //additonally, long and Long are different... I've been using long, so i changed all to Long
    BookInfoEntity saveBookInfo(BookInfoEntity bookInfoEntity); //lowercase?
    BookInfoEntity updateBookInfo(BookInfoEntity bookInfoEntity); //lowercase as well
    void deleteBookInfo(Long isbn);
}
