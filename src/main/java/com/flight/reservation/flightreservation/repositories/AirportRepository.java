package com.flight.reservation.flightreservation.repositories;

import com.flight.reservation.flightreservation.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Long, Airport> {
}
