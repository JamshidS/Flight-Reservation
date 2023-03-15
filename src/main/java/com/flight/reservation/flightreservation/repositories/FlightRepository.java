package com.flight.reservation.flightreservation.repositories;

import com.flight.reservation.flightreservation.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Long, Flight> {
}
