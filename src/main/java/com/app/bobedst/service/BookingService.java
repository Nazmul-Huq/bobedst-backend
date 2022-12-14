package com.app.bobedst.service;

import com.app.bobedst.model.Booking;
import com.app.bobedst.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class BookingService implements IBookingService{

    @Autowired
    BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Set<Booking> findAll() {
        return (Set<Booking>) bookingRepository.findAll();
    }

    @Override
    public Booking save(Booking object) {
        return bookingRepository.save(object);
    }

    @Override
    public Optional<Booking> findById(Long aLong) {
        return bookingRepository.findById(aLong);
    }

    @Override
    public void delete(Booking object) {
        bookingRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        bookingRepository.deleteById(aLong);
    }

    @Override
    public Booking update(Booking object) {
        return bookingRepository.save(object);
    }
}
