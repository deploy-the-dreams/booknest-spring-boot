package com.deploythedreams.book_rental_system.controller;

import com.deploythedreams.book_rental_system.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    // Book collection
    private final List<Book> books = List.of(
            new Book(1L, "Clean Code", "Robert C. Martin"),
            new Book(2L, "Effective Java", "Joshua Bloch"),
            new Book(3L, "The Pragmatic Programmer", "Andrew Hunt")
    );
    @GetMapping
    public List<Book> getBooks() {
        return books;
    }
    @GetMapping("/count")
    public int getBookCount() {
        return books.size();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {

        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @GetMapping("/author/{author}")
    public Book getBookByAuthor(@PathVariable String author) {

        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .findFirst()
                .orElse(null);
    }
}