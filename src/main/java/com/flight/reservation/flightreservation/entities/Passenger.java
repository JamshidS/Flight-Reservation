package com.flight.reservation.flightreservation.entities;

import lombok.Cleanup;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "passenger")
@Data
public class Passenger extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "passportnumber")
    private String passportNumber;

    @ManyToMany(cascade = {CascadeType.MERGE})
    private List<Flight> flights;

}
