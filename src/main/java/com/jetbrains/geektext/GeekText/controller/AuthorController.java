package com.jetbrains.geektext.GeekText.controller;

import com.jetbrains.geektext.GeekText.entity.AuthorEntity;
import com.jetbrains.geektext.GeekText.entity.BookInfoEntity;
import com.jetbrains.geektext.GeekText.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
    @GetMapping
    public List<AuthorEntity> findAllAuthors(){
        return authorService.findAllAuthors();
    }
    @GetMapping("/{id}")
    public Optional<BookInfoEntity> getBooksbyAuthorid(@PathVariable("id") Long id){
        return authorService.getBooksbyAuthorid(id);
    }
    @PostMapping
    public AuthorEntity addAuthor(@RequestBody AuthorEntity authorEntity){
        return authorService.addAuthor(authorEntity);
    }
}
