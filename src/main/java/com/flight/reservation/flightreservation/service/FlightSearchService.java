package com.flight.reservation.flightreservation.service;

import com.flight.reservation.flightreservation.entities.Flight;

import java.time.LocalDate;

public interface FlightSearchService {
    Flight getFlightByDate(LocalDate date);
    Flight getByUserSearch(String credentials);
}
