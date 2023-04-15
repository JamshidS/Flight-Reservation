package com.flight.reservation.flightreservation.repositories;

import com.flight.reservation.flightreservation.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    Flight findByFlightNumber(String flightNumber);
    List<Flight> findFlightsByAirportName(String name);

    List<Flight> findByDate(String date);

    Flight findFlightByAirportName(String name);

}
