package com.flight.reservation.flightreservation.repositories;

import com.flight.reservation.flightreservation.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Long, Country> {
}
