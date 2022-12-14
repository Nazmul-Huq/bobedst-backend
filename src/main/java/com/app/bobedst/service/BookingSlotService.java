package com.app.bobedst.service;

import com.app.bobedst.model.BookingSlot;
import com.app.bobedst.repository.BookingSlotRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class BookingSlotService implements IBookingSlotService {
    BookingSlotRepository bookingSlotRepository;

    public BookingSlotService(BookingSlotRepository bookingSlotRepository) {
        this.bookingSlotRepository = bookingSlotRepository;
    }

    @Override
    public Set<BookingSlot> findAll() {
        return (Set<BookingSlot>) bookingSlotRepository.findAll();
    }

    @Override
    public List<BookingSlot> findAllBookingSlot() {
        List<BookingSlot> bookingSlotList = bookingSlotRepository.findAll();
        bookingSlotList.forEach(bookingSlot -> System.out.println(bookingSlot));
        return  bookingSlotList;
    }

    @Override
    public BookingSlot save(BookingSlot object) {
        return bookingSlotRepository.save(object);
    }

    @Override
    public Optional<BookingSlot> findById(Long aLong) {
        return bookingSlotRepository.findById(aLong);
    }

    @Override
    public void delete(BookingSlot object) {
        bookingSlotRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        bookingSlotRepository.deleteById(aLong);
    }

    @Override
    public BookingSlot update(BookingSlot object) {
        return bookingSlotRepository.save(object);
    }

    @Override
    public Set<BookingSlot> getAvailableBookingSlot(LocalDateTime startDate, LocalDateTime endDate) {
        return bookingSlotRepository.getAvailableBookingSlot(startDate, endDate);    }

}
