package com.app.bobedst.repository;

import com.app.bobedst.model.Apartment;
import org.springframework.data.repository.CrudRepository;

public interface ApartmentRepository extends CrudRepository<Apartment, Long> {
}
