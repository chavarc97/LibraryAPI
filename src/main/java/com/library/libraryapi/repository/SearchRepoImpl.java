package com.library.libraryapi.repository;

import com.library.libraryapi.models.Book;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class SearchRepoImpl implements SearchRespository {

    @Autowired
    MongoClient mongoClient;

    @Autowired
    MongoConverter mongoConverter;

    @Override
    public List<Book> findByTitle(String title) {

        final List<Book> books = new ArrayList<>();


        MongoDatabase database = mongoClient.getDatabase("books");
        MongoCollection<Document> collection = database.getCollection("books");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("index", "title")
                        .append("text",
                        new Document("query", title)
                        .append("path", "title"))),
                        new Document("$sort",
                        new Document("average_rating", -1L)),
                        new Document("$limit", 10L)));

        result.forEach(doc -> books.add(mongoConverter.read(Book.class, doc)));

        return books;
    }
}
