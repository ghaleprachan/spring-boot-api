package com.database.dbconnection.mappers;

public interface Mappers<A, B> {
    B mapTo(A a);

    A mapFrom(B a);
}
