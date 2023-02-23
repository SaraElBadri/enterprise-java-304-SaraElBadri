package com.ironhack.java304.repositories;

import com.ironhack.java304.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface FlightRepository extends JpaRepository <Flight, String> {
    Collection<Object> findByAircraftContaining(String boeing);
}
