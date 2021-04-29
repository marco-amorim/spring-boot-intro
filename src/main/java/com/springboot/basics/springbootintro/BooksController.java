package com.springboot.basics.springbootintro;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = new ArrayList<Book>();

        books.add(new Book(1, "Book 1", "Author 1"));
        books.add(new Book(2, "Book 2", "Author 2"));

        return ResponseEntity.status(HttpURLConnection.HTTP_OK).body(books);
    }
}
