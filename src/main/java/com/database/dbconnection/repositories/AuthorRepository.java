package com.database.dbconnection.repositories;

import com.database.dbconnection.domain.entities.AuthorEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// @Repository makes this as repository, and it can be injected anywhere
@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity, Long> {
    Iterable<AuthorEntity> ageLessThan(int age);

    // This is HQL query
//    @Query("SELECT * FROM author WHERE age > ?12")
//    Iterable<AuthorEntity> findAuthorAgeGreaterThan(int age);
}
