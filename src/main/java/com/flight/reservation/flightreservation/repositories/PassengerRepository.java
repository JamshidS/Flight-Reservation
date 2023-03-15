package com.flight.reservation.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Long, com.flight.reservation.flightreservation.entities.Passenger> {
}
