package com.app.bobedst.repository;

import com.app.bobedst.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
}
