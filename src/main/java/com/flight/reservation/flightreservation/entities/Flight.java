package com.flight.reservation.flightreservation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

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

    @JsonIgnore
    @ManyToOne
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "airport_id", nullable = false)
    private Airport airport;

    @ManyToOne
    @JoinColumn(name = "airline_id", nullable = false)
    private AirlineInfo airlineInfo;

    @EqualsAndHashCode.Exclude
    @JsonManagedReference
    @ManyToMany(
            mappedBy = "flights",
            cascade = {CascadeType.MERGE})
    private Set<Passenger> passengers;

}
