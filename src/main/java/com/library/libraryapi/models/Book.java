package com.library.libraryapi.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Document(collection = "books")
public class Book {
    private String _id;
    private String title;
    private String[] authors;
    private double average_rating;
    private String isbn;
    private String isbn13;
    private String language_code;
    private int num_pages;
    private int ratings_count;
    private int textReviews_count;
    private String publication_date;
    private String publisher;

    // Constructors
    public Book() {
    }

    // Getters and Setters
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public double getAverage_rating() {
        return average_rating;
    }

    public void setAverage_rating(double average_rating) {
        this.average_rating = average_rating;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getLanguage_code() {
        return language_code;
    }

    public void setLanguage_code(String language_code) {
        this.language_code = language_code;
    }

    public int getNum_pages() {
        return num_pages;
    }

    public void setNum_pages(int num_pages) {
        this.num_pages = num_pages;
    }

    public int getRatings_count() {
        return ratings_count;
    }

    public void setRatings_count(int ratings_count) {
        this.ratings_count = ratings_count;
    }

    public int getTextReviews_count() {
        return textReviews_count;
    }

    public void setTextReviews_count(int textReviews_count) {
        this.textReviews_count = textReviews_count;
    }

    public String getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(String publication_date) {
        this.publication_date = publication_date;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", average_rating=" + average_rating +
                ", isbn='" + isbn + '\'' +
                ", isbn13='" + isbn13 + '\'' +
                ", language_code='" + language_code + '\'' +
                ", num_pages=" + num_pages +
                ", ratings_count=" + ratings_count +
                ", textReviews_count=" + textReviews_count +
                ", publication_date='" + publication_date + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }


}
