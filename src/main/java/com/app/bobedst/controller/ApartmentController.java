package com.app.bobedst.controller;

import com.app.bobedst.model.Apartment;
import com.app.bobedst.service.ApartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApartmentController {
    private ApartmentService apartmentService;
    @GetMapping("/getApartment/{id}")
    public ResponseEntity<Apartment> getApartmentByID(@PathVariable("id") Long id){
        return new ResponseEntity<>(apartmentService.findById(id).get(), HttpStatus.FOUND);
    }
}
