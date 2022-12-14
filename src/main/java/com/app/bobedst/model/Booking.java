package com.app.bobedst.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Booking {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String phone;
    private String email;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "booking_slot_id")
    private BookingSlot bookingSlot;
}
