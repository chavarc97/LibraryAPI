package com.library.libraryapi.controllers;

import com.library.libraryapi.BookRepository;
import com.library.libraryapi.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository repo;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return repo.findAll();
    }
}
