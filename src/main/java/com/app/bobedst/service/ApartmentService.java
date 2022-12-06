package com.app.bobedst.service;

import com.app.bobedst.model.Apartment;
import com.app.bobedst.repository.ApartmentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class ApartmentService implements IApartmentService {

    private ApartmentRepository apartmentRepository;

    public ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    @Override
    public Set<Apartment> findAll() {
        return null;
    }

    @Override
    public Apartment save(Apartment apartment) {
        apartmentRepository.save(apartment);
        return apartment;
    }

    @Override
    public Optional<Apartment> findById(Long id) {
        return apartmentRepository.findById(id);
    }

    @Override
    public void delete(Apartment object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Apartment update(Apartment object) {
        return null;
    }
}
