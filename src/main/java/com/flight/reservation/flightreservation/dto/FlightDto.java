package com.flight.reservation.flightreservation.dto;

import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class FlightDto {

    private String destination;
    private String duration;
    private LocalDate flightDate;
    private String flightNumber;
    private LocalTime flightTime;
    private String origin;
}
