package com.flight.reservation.flightreservation.service;

import com.flight.reservation.flightreservation.dto.FlightDto;
import com.flight.reservation.flightreservation.entities.Airport;
import com.flight.reservation.flightreservation.entities.Flight;

import java.util.List;

public interface FlightService {
    String addFlight(FlightDto flightDto);
    String updateFlight(FlightDto flightDto, Long id);
    List<Flight> getAll();

    String deleteFlight(Long id);
    Flight getById(Long id);

    Flight getFlightByAirPort(Airport airport);
    List<Flight> getFlightsByAirport(Airport airport);

    List<Flight> getByDate(String date);

    Flight getByFlightNumber(String flightNumber);

}
