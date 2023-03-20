package com.flight.reservation.flightreservation.entities;

import lombok.Cleanup;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "passenger")
@Data
public class Passenger{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "passportnumber")
    private String passportNumber;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "dataOfBirth")
    private String dataOfBirth;
    @Column(name = "email")
    private String email;
    @Column(name = "phonenumber")
    private String phoneNumber;

    @ManyToMany(cascade = {CascadeType.MERGE})
    private List<Flight> flights;

    @ManyToOne
    private Country country;

}
