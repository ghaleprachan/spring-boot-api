package com.database.dbconnection.mappers.impl;

import com.database.dbconnection.domain.dto.AuthorDto;
import com.database.dbconnection.domain.entities.AuthorEntity;
import com.database.dbconnection.mappers.Mappers;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapperImpl implements Mappers<AuthorEntity, AuthorDto> {
    private final ModelMapper modelMapper;

    public AuthorMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public AuthorDto mapTo(AuthorEntity authorEntity) {
        return modelMapper.map(authorEntity, AuthorDto.class);
    }

    @Override
    public AuthorEntity mapFrom(AuthorDto authorDto) {
        return modelMapper.map(authorDto, AuthorEntity.class);
    }
}
