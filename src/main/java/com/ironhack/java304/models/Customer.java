package com.ironhack.java304.models;

import com.ironhack.java304.Enum.Status;
import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "Enum('GOLD', 'SILVER', 'NONE')")
    private Status status;

    public Customer() {
    }

    public Customer(String name, Status status) {
        setName(name);
       setStatus(status);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
