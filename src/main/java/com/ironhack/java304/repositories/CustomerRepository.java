package com.ironhack.java304.repositories;

import com.ironhack.java304.Enum.Status;
import com.ironhack.java304.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CustomerRepository extends JpaRepository <Customer, Integer>{


    Optional<Object> findByName(String name);

    Optional<Object> findByStatus(Status status);
}
