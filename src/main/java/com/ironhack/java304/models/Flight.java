package com.ironhack.java304.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Flight {
    @Id
    private String flightNumber;
    private Long mileage;
    private String aircraft;

    public Flight() {
    }

    public Flight(String flightNumber, Long mileage, String aircraft) {
        setFlightNumber(flightNumber);
        setMileage(mileage);
        setAircraft(aircraft);
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Long getMileage() {
        return mileage;
    }

    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Flight flight = (Flight) object;
        return Objects.equals(getFlightNumber(), flight.getFlightNumber()) && Objects.equals(getMileage(), flight.getMileage()) && Objects.equals(getAircraft(), flight.getAircraft());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlightNumber(), getMileage(), getAircraft());
    }
}