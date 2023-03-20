package com.flight.reservation.flightreservation.repositories;

import com.flight.reservation.flightreservation.entities.BookingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRecordRepository extends JpaRepository<BookingRecord,Long> {
}
