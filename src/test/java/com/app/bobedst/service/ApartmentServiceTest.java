package com.app.bobedst.service;

import com.app.bobedst.model.Apartment;
import com.app.bobedst.repository.ApartmentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
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
        /*
        Apartment apartment = new Apartment(1L, "Beliggende ved en sø");

        Apartment savedApartment = apartmentRepository.save(apartment);

        Assertions.assertEquals(1L, 1L);

         */
    }

    /**@Test
    void findApartmentById() {

        ApartmentInfo apartmentInfo = new ApartmentInfo(1L, "Huset er koldt");

        ApartmentInfo findApartmentId = apartmentInfoService.findById();

        Assertions.assertEquals(1, findApartmentId);

    }
    **/
/*
        @Mock
        private EntityManager em;

        @InjectMocks
        private ApartmentService apartmentServiceMock = new ApartmentService();

        @Test
        public void testIsApartmentAvailable() {
            // mock the EntityManager to return an apartment when the query is executed
            when(em.createQuery("SELECT a FROM Apartment a WHERE a.id = :id"))
                    .thenReturn(mock(Query.class));
            when(query.getSingleResult()).thenReturn(new Apartment(1, true));

            // call the isApartmentAvailable() method and verify that it returns true
            assertTrue(apartmentService.isApartmentAvailable(123));
        }

 */
        /*
            In this example, we have a ApartmentServiceTest class that uses the JUnit and Mockito frameworks
            to create a test case for the isApartmentAvailable() method.
            The test case uses a mock EntityManager object to simulate the behavior of the EntityManager
            when the isApartmentAvailable() method is called,
            and then it calls the isApartmentAvailable() method and verifies that it returns the expected result.
         */






}