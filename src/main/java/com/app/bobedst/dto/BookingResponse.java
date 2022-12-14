package com.app.bobedst.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import java.time.LocalDateTime;
import java.util.Date;

public class BookingResponse {
    private long bookingId;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date date;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime startTime;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime  endTime;
    private String name;
    private String phone;
    private String email;
}
