package com.ironhack.java304;

import com.ironhack.java304.Enum.Status;
import com.ironhack.java304.models.Customer;
import com.ironhack.java304.repositories.CustomerRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CustomerTest {

    @Autowired
    CustomerRepository customerRepository;

    Customer customer;
    Customer customer2;

    @BeforeEach
    void setUp() {
        customer = customerRepository.save(new Customer("Chris Evans", Status.SILVER));
        customer2 = customerRepository.save(new Customer("Tom Holland", Status.NONE));

    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }


    @Test
    void createCustomer_WhenCalled() {
        assertEquals("Chris Evans", customerRepository.findById(customer.getId()).get().getName());
    }

    @Test
    void findCustomer_ByName() {

        assertTrue(customerRepository.findByName("Chris Evans").isPresent());
        assertFalse(customerRepository.findByName("Robert Downey").isPresent());

    }

    @Test
    void findCustomer_ByStatus() {
        assertTrue(customerRepository.findByStatus(Status.SILVER).isPresent());
    }
}
