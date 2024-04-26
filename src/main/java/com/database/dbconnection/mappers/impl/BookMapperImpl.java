package com.database.dbconnection.mappers.impl;

import com.database.dbconnection.domain.dto.BooksDto;
import com.database.dbconnection.domain.entities.BookEntity;
import com.database.dbconnection.mappers.Mappers;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapperImpl implements Mappers<BookEntity, BooksDto> {
    private final ModelMapper modelMapper;

    public BookMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public BooksDto mapTo(BookEntity bookEntity) {
        return modelMapper.map(bookEntity, BooksDto.class);
    }

    @Override
    public BookEntity mapFrom(BooksDto a) {
        return modelMapper.map(a, BookEntity.class);
    }
}
