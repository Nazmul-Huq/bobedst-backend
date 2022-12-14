package com.app.bobedst.controller;

import com.app.bobedst.dto.BookingSlotRequest;
import com.app.bobedst.dto.BookingSlotResponse;
import com.app.bobedst.model.BookingSlot;
import com.app.bobedst.service.IBookingSlotService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/booking-slot")
public class BookingSlotController {

    // INSERT INTO `bobedst`.`booking_slot` (`date`, `end_time`, `is_booked`, `start_time`) VALUES ('2020-01-01 00:00:00.000000', '2020-01-01 08:01:00.000000', '0', '2020-01-01 08:15:00.000000');
    IBookingSlotService bookingSlotService;

    public BookingSlotController(IBookingSlotService bookingSlotService) {
        this.bookingSlotService = bookingSlotService;
    }

    @PostMapping("/get-available-booking-slot")
    @CrossOrigin
    public ResponseEntity<List<BookingSlotResponse>> getAvailableBookingSlot(@RequestBody BookingSlotRequest bookingSlotRequest){
        System.out.println("Start date request" + bookingSlotRequest.getDate());
        LocalDateTime localDateStart = bookingSlotRequest.getDate().atTime(00,1, 1, 000000);
        LocalDateTime localDateEnd = bookingSlotRequest.getDate().atTime(23,59, 59, 000000);

        Set<BookingSlot> bookingSlots = bookingSlotService.getAvailableBookingSlot(localDateStart, localDateEnd);
        List<BookingSlotResponse> bookingSlotResponses = new ArrayList<>();
        bookingSlots.forEach(bookingSlot -> {
            System.out.println(bookingSlot);
            BookingSlotResponse bookingSlotResponse = new BookingSlotResponse();
            bookingSlotResponse.setId(bookingSlot.getId());
            LocalDateTime startDateTime = bookingSlot.getStartTime();
            LocalDateTime endDateTime = bookingSlot.getEndTime();
            String time = startDateTime.getHour() + "." + startDateTime.getMinute()+"-"+ endDateTime.getHour()+"."+ endDateTime.getMinute();
            bookingSlotResponse.setTime(time);
            bookingSlotResponses.add(bookingSlotResponse);
        });
        return ResponseEntity.ok(bookingSlotResponses);
    }
}
