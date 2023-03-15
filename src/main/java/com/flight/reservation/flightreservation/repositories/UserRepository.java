package com.flight.reservation.flightreservation.repositories;

import com.flight.reservation.flightreservation.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {
}
