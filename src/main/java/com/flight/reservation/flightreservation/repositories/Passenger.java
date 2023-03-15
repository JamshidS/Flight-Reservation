package com.flight.reservation.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Passenger extends JpaRepository<Long, com.flight.reservation.flightreservation.entities.Passenger> {
}
