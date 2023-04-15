package com.flight.reservation.flightreservation.service;

import com.flight.reservation.flightreservation.entities.Airport;

import java.util.List;

public interface AirPortService {
    String addAirPort(Airport airport);
    List<Airport> getAll();

    Airport getAirportById(Long id);

    String deleteAirportById(Long id);
    Airport findAirportByName(String name);


}
