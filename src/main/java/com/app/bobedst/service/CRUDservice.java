package com.app.bobedst.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface CRUDservice<T, ID> {

    //Create
    List<T> findAll(); //<--

    //omvendt

    //Read
    T save(T object); //<--

    Optional<T> findById(ID id);

    //Delete
    void delete(T object);

    void deleteById(ID id);

    //Update
    T update(T object);

    boolean isApartmentAvailable (long apartmentId);

}
