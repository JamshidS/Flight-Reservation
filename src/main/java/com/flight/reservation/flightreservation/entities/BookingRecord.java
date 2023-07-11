package com.flight.reservation.flightreservation.entities;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "bookingrecord")
@Data
public class BookingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "booking_date")
    private LocalDateTime bookingDate;
    @Column(name = "destination")
    private String destination;
    @Column(name = "flight_date")
    private LocalDate flightDate;
    @Column(name = "flight_number")
    private String flightNumber;
    @Column(name = "flight_time")
    private LocalTime flightTime;
    @Column(name = "origin")
    private String origin;
    @Column(name = "status")
    private String status;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name="bookingDetails", joinColumns = {
            @JoinColumn(name="bookingId")} ,
            inverseJoinColumns = {@JoinColumn(name="passengerId")})
    private List<Passenger> passengers;

}
