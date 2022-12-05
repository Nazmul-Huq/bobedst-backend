package com.app.bobedst.controller;

import com.app.bobedst.model.ApartmentInfo;
import com.app.bobedst.service.ApartmentInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApartmentController {
    private ApartmentInfoService apartmentInfoService;
    @GetMapping("/getApartment/{id}")
    public ResponseEntity<ApartmentInfo> getApartmentByID(@PathVariable("id") Long id){
        return new ResponseEntity<>(apartmentInfoService.findById(id).get(), HttpStatus.FOUND);
    }
}
