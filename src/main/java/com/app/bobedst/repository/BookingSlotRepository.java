package com.app.bobedst.repository;

import com.app.bobedst.model.BookingSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.Set;

public interface BookingSlotRepository extends JpaRepository<BookingSlot, Long> {

    @Query(value = "SELECT s FROM BookingSlot s WHERE s.startTime > ?1 AND s.endTime < ?2 AND s.isBooked = false")
    Set<BookingSlot> getAvailableBookingSlot(LocalDateTime startDate, LocalDateTime endDate);
}
