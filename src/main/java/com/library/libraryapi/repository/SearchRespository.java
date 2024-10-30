package com.library.libraryapi.repository;

import com.library.libraryapi.models.Book;

import java.util.List;

public interface SearchRespository {
    List<Book> findByTitle(String title);

}
