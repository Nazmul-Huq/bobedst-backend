package com.app.bobedst.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingSlotRequest {
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
}
