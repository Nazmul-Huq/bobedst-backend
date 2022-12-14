package com.app.bobedst.controller;

import com.app.bobedst.dto.BookingRequest;
import com.app.bobedst.model.Booking;
import com.app.bobedst.model.BookingSlot;
import com.app.bobedst.service.IBookingService;
import com.app.bobedst.service.IBookingSlotService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {

    IBookingService bookingService;
    IBookingSlotService bookingSlotService;

    public BookingController(IBookingService bookingService, IBookingSlotService bookingSlotService) {
        this.bookingService = bookingService;
        this.bookingSlotService = bookingSlotService;
    }

    @PostMapping("/save")
    @CrossOrigin
    public ResponseEntity<Booking> save(@RequestBody BookingRequest bookingRequest){
        Optional<BookingSlot> bookingSlot = bookingSlotService.findById(Long.valueOf(bookingRequest.getBookingSlotId()));
        Booking newlyMadeBooking = new Booking();
        if (bookingSlot.isPresent()) {
            Booking booking = new Booking();
            booking.setName(bookingRequest.getName());
            booking.setPhone(bookingRequest.getPhone());
            booking.setEmail(bookingRequest.getEmail());
            booking.setBookingSlot(bookingSlot.get());
            newlyMadeBooking = bookingService.save(booking);

            BookingSlot bookingSlotToUpdate = bookingSlot.get();
            bookingSlotToUpdate.setBooked(true);
            bookingSlotService.save(bookingSlotToUpdate);
        }
        return new ResponseEntity<>(newlyMadeBooking, HttpStatus.OK);
    }
}
