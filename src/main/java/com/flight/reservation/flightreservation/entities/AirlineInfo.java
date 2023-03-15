package com.flight.reservation.flightreservation.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "airlineInfo", fetch = FetchType.LAZY)
    private List<Flight> flightList;
}
