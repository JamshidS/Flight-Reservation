package com.flight.reservation.flightreservation.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Airport")
@Data

public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private Long id;
    @Column(name ="name")
    private String name;
    @Column(name ="address")
    private String address;
    @Column(name ="code")
    private String code;

    @OneToMany(mappedBy = "airport", fetch = FetchType.LAZY)
    private List<Flight> flights;
}
