package com.app.bobedst.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApartmentDummyController {
    /*

    @GetMapping("/api/v1/apartment")
    @CrossOrigin
    public ResponseEntity<List<ApartmentDummyDto>> getAllApartment(){
        ApartmentDummyDto apartmentDummyDto1 = new ApartmentDummyDto();
        apartmentDummyDto1.setFloor("1c");
        apartmentDummyDto1.setSize(100.00);

        ApartmentDummyDto apartmentDummyDto2 = new ApartmentDummyDto();
        apartmentDummyDto2.setFloor("2");
        apartmentDummyDto2.setSize(50.00);

        List<ApartmentDummyDto> apartments = new ArrayList<>();
        apartments.add(apartmentDummyDto1);
        apartments.add(apartmentDummyDto2);

        return new ResponseEntity<>(apartments, HttpStatus.OK);
    }

     */
}
