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
    @Column(name = "passport_number")
    private String passportNumber;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "data_of_birth")
    private String dataOfBirth;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToMany(cascade = {CascadeType.MERGE})
    private List<Flight> flights;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @ManyToOne
    @JoinColumn(name = "bookingrecord_id", nullable = false)
    private BookingRecord bookingRecord;

}
