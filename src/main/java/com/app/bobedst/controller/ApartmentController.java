package com.app.bobedst.controller;

import com.app.bobedst.model.Apartment;
import com.app.bobedst.service.ApartmentService;
import com.app.bobedst.service.IApartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class ApartmentController {
    private IApartmentService apartmentService;

    public ApartmentController(IApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @GetMapping("/getApartment/{id}")
    public ResponseEntity<Apartment> getApartmentByID(@PathVariable("id") Long id) {
        return new ResponseEntity<>(apartmentService.findById(id).get(), HttpStatus.FOUND);
    }


    @GetMapping("/get/overviewOfApartments")
    @CrossOrigin
    public ResponseEntity<List<Apartment>> getOverViewOfApartments() {
       // Apartment apartment = new Apartment();
        //System.out.println("Request from Frontend");

        //return new ResponseEntity<>(apartment, HttpStatus.OK);
        List<Apartment> apartments = apartmentService.findAll();
       return new ResponseEntity<>(apartments, HttpStatus.OK);
    }


    @GetMapping("/get/apartments/{id}")
    public String getApartmentAvailability(@PathVariable("id") long apartmentId, Model model) {
        boolean isAvailable = apartmentService.isApartmentAvailable(apartmentId);
        model.addAttribute("isAvailable", isAvailable);

        return "apartmentAvailability";
    }
    //mo

}
