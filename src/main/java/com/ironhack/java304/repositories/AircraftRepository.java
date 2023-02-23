package com.ironhack.java304.repositories;

import com.ironhack.java304.models.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AircraftRepository extends JpaRepository<Aircraft,String> {
}
