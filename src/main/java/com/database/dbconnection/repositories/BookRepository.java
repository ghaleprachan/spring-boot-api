package com.database.dbconnection.repositories;

import com.database.dbconnection.domain.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookRepository extends CrudRepository<BookEntity, Long>, PagingAndSortingRepository<BookEntity, Long> {


}
