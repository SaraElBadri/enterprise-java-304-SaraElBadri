package com.ironhack.java304.models;

import jakarta.persistence.*;

@Entity
public class Aircraft {
    @Id
    private String model;
    private Integer seats;

    public Aircraft() {
    }

    public Aircraft(String model, Integer seats) {
        setModel(model);
        setSeats(seats);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}

