package com.database.dbconnection.services;

import com.database.dbconnection.domain.entities.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {
    BookEntity createBook( BookEntity book);

    Page<BookEntity> findAll(Pageable pageable);
}
