package com.ironhack.java304;


import com.ironhack.java304.models.Flight;
import com.ironhack.java304.repositories.FlightRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class FlightTest {

    @Autowired
    FlightRepository flightRepository;
    Flight flight1;
    Flight flight2;
    Flight flight3;

    @BeforeEach
    void setUp() {
        flight1 = flightRepository.save(new Flight("DL143", 115235l, "Boeing 747"));
        flight2 = flightRepository.save(new Flight("DL222", 5000l, "Boeing 777"));
        flight3 = flightRepository.save(new Flight("DL122", 7500l, "Airbus 330"));

    }

    @AfterEach
    void tearDown() {
        flightRepository.deleteAll();
    }

    @Test
    void createFlight_whenCalled(){
        assertEquals("DL122", flightRepository.findById(flight3.getFlightNumber()).get().getFlightNumber());
    }

    @Test
    void findFlight_byFlightNumber(){
        assertTrue(flight2.equals(flightRepository.findById("DL222").get()));
    }


    @Test
    void findFlights_UsingBoeingAircraft(){
        assertEquals(2, flightRepository.findByAircraftContaining("Boeing").size());
    }



}
