package com.database.dbconnection.services.impl;

import com.database.dbconnection.domain.entities.BookEntity;
import com.database.dbconnection.repositories.BookRepository;
import com.database.dbconnection.services.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createBook(BookEntity book) {
        // Here the book id will not be updated because it is generated in sequence
        return bookRepository.save(book);
    }

    @Override
    public Page<BookEntity> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

}
