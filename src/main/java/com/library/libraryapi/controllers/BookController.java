package com.library.libraryapi.controllers;

import com.library.libraryapi.repository.BookRepository;
import com.library.libraryapi.models.Book;
import com.library.libraryapi.repository.SearchRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {

    @Autowired
    BookRepository repo;

    @Autowired
    SearchRespository searchRepo;
    @Autowired
    private View error;

    @GetMapping("/books")
    @CrossOrigin
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    // get the book by title index
    @GetMapping("/books/{text}")
    @CrossOrigin
    public List <Book> getBookByTitle(@PathVariable String text){
        return searchRepo.findByTitle(text);
    }

    @PostMapping("/book")
    @CrossOrigin
    public Book addBook(@RequestBody Book book) {
        return repo.save(book);
    }

    // modify the book
    @PutMapping("/book/{id}")
    @CrossOrigin
    public Book modifyBook(@PathVariable String id, @RequestBody Book book) {
        repo.findById(id);
        if(repo.findById(id).isPresent()) {
            Book bookToModify = repo.findById(id).get();
            bookToModify.setTitle(book.getTitle());
            bookToModify.setAuthors(book.getAuthors());
            bookToModify.setAverage_rating(book.getAverage_rating());
            bookToModify.setIsbn(book.getIsbn());
            bookToModify.setIsbn13(book.getIsbn13());
            bookToModify.setLanguage_code(book.getLanguage_code());
            bookToModify.setNum_pages(book.getNum_pages());
            bookToModify.setRatings_count(book.getRatings_count());
            bookToModify.setTextReviews_count(book.getTextReviews_count());
            bookToModify.setPublication_date(book.getPublication_date());
            bookToModify.setPublisher(book.getPublisher());
            return repo.save(bookToModify);
        } else {
            return null;
        }
    }

    // delete the book
    @DeleteMapping("/book/{id}")
    @CrossOrigin
    public Book deleteBook(@PathVariable String id) {
        if(repo.findById(id).isPresent()) {
            Book book = repo.findById(id).get();
            repo.deleteById(id);
            return book;
        } else {
            String message = "Book not found";
            System.out.println(message);
            return null;
        }
    }
}
