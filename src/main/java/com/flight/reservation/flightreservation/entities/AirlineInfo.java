package com.flight.reservation.flightreservation.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "airlineInfo")
@Data
public class AirlineInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "id")
    private String airlineName;

}
