package com.library.libraryapi.repository;

import com.library.libraryapi.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

}
