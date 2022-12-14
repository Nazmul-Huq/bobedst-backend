package com.app.bobedst.service;

import com.app.bobedst.model.BookingSlot;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public interface IBookingSlotService extends CRUDservice<BookingSlot, Long>{
    public List<BookingSlot> findAllBookingSlot();
    public Set<BookingSlot> getAvailableBookingSlot(LocalDateTime startDate, LocalDateTime endDate);

    }
