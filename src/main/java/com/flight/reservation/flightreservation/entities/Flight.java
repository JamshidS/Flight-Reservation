package com.flight.reservation.flightreservation.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "flight")
@Data
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "destination")
    private String destination;
    @Column(name = "duration")
    private String duration;
    @Column(name = "flightDate")
    private LocalDate flightDate;
    @Column(name = "flightNumber")
    private String flightNumber;
    @Column(name = "flightTime")
    private LocalTime flightTime;
    @Column(name = "origin")
    private String origin;

}
