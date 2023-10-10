package com.jetbrains.geektext.GeekText.controller;

import com.jetbrains.geektext.GeekText.entity.BookInfoEntity;
import com.jetbrains.geektext.GeekText.service.BookInfoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//run this with http://localhost:8080/bookinfo idk why

@RestController
@RequestMapping("/bookinfo")
public class BookInfoController {
    private final BookInfoService bookInfoService;

    public BookInfoController(BookInfoService bookInfoService){
        this.bookInfoService = bookInfoService;
    }

    @GetMapping
    public List<BookInfoEntity> findAllBookInfo(){
        return bookInfoService.findAllBookInfo();
    }

    @GetMapping("/{isbn}")
    public Optional<BookInfoEntity> findBookInfoByISBN(@PathVariable("isbn") Long isbn){
        return bookInfoService.findByISBN(isbn);
    }

    @PostMapping
    public BookInfoEntity addBook(@RequestBody BookInfoEntity bookInfoEntity){
        return bookInfoService.addBook(bookInfoEntity);
    }
}
