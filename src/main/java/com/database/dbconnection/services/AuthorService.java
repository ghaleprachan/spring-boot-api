package com.database.dbconnection.services;

import com.database.dbconnection.domain.entities.AuthorEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;


public interface AuthorService {

    AuthorEntity createAuthor(AuthorEntity author);

    List<AuthorEntity> getAuthors();

    Optional<AuthorEntity> getAuthor(Long id);

    boolean isExists(Long id);

    AuthorEntity partialUpdate(Long id, AuthorEntity authorEntity);

    void delete(Long id);
}
