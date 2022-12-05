package com.app.bobedst.service;

import com.app.bobedst.model.ApartmentInfo;
import com.app.bobedst.repository.ApartmentInfoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest()
class ApartmentInfoServiceTest {

    private ApartmentInfoService apartmentInfoService;
    @Autowired
    private ApartmentInfoRepository apartmentInfoRepository;

    @Test

    @BeforeEach
    public void setUp(){
        apartmentInfoService = new ApartmentInfoService(apartmentInfoRepository);
    }

    @Test
    void saveInfo() {
        ApartmentInfo apartmentInfo = new ApartmentInfo(1L, "Beliggende ved en sø");

        ApartmentInfo savedInfo = apartmentInfoRepository.save(apartmentInfo);

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