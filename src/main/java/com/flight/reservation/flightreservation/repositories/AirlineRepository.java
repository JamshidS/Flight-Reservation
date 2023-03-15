package com.flight.reservation.flightreservation.repositories;

import com.flight.reservation.flightreservation.entities.AirlineInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineRepository extends JpaRepository<Long, AirlineInfo> {
}
