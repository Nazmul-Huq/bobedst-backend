package com.app.bobedst.dto;

import lombok.Data;

@Data
public class BookingRequest {
    private int bookingSlotId;
    private String name;
    private String phone;
    private String email;
}
