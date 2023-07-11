package com.flight.reservation.flightreservation.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
@Data
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="country_name")
    private String countryName;

    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private List<Passenger> passengers;



}
