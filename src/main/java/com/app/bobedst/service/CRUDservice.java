package com.app.bobedst.service;

import java.util.Optional;
import java.util.Set;

public interface CRUDservice<T, ID> {

    //Create
    Set<T> findAll();

    //Read
    T save(T object);

    Optional<T> findById(ID id);

    //Delete
    void delete(T object);

    void deleteById(ID id);

    //Update
    T update(T object);

}
