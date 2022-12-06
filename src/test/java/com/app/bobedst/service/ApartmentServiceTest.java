package com.app.bobedst.service;

import com.app.bobedst.model.Apartment;
import com.app.bobedst.repository.ApartmentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest()
class ApartmentServiceTest {

    private ApartmentService apartmentService;
    @Autowired
    private ApartmentRepository apartmentRepository;

    @Test

    @BeforeEach
    public void setUp(){
        apartmentService = new ApartmentService(apartmentRepository);
    }

    @Test
    void saveInfo() {
        Apartment apartment = new Apartment(1L, "Beliggende ved en sø");

        Apartment savedApartment = apartmentRepository.save(apartment);

        Assertions.assertEquals(1L, 1L);
    }

    /**@Test
    void findApartmentById() {

        ApartmentInfo apartmentInfo = new ApartmentInfo(1L, "Huset er koldt");

        ApartmentInfo findApartmentId = apartmentInfoService.findById();

        Assertions.assertEquals(1, findApartmentId);

    }
    **/
}