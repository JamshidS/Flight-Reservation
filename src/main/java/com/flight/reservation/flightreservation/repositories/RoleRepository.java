package com.flight.reservation.flightreservation.repositories;

import com.flight.reservation.flightreservation.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
