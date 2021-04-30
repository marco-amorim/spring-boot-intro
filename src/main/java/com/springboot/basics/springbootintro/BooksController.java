package com.springboot.basics.springbootintro;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = new ArrayList<Book>();

        books.add(new Book(1, "Book 1", "Author 1"));
        books.add(new Book(2, "Book 2", "Author 2"));

        return ResponseEntity.status(HttpURLConnection.HTTP_OK).body(books);
    }

    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody Book requestBook) {

        System.out.println("Book saved!");
        System.out.println(requestBook.toString());

        return ResponseEntity.status(HttpURLConnection.HTTP_OK).body(requestBook);

    }
}
