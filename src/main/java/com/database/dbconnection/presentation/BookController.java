package com.database.dbconnection.presentation;

import com.database.dbconnection.domain.dto.BooksDto;
import com.database.dbconnection.domain.entities.BookEntity;
import com.database.dbconnection.mappers.Mappers;
import com.database.dbconnection.services.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book/")
public class BookController {
    private final BookService bookService;
    private final Mappers<BookEntity, BooksDto> mappers;

    public BookController(BookService bookService, Mappers<BookEntity, BooksDto> mappers) {
        this.bookService = bookService;
        this.mappers = mappers;
    }

    @PostMapping("/books")
    public ResponseEntity<BooksDto> createBook(@RequestBody BooksDto booksDto) {
        BookEntity bookEntity = mappers.mapFrom(booksDto);
        BooksDto createdBook = mappers.mapTo(bookService.createBook(bookEntity));
        return new ResponseEntity<>(createdBook, HttpStatus.CREATED);
    }

    @GetMapping("/books")
    public Page<BooksDto> getBooks(Pageable pageable) {
        Page<BookEntity> bookEntities = bookService.findAll(pageable);
        return bookEntities.map(mappers::mapTo);
    }
}
