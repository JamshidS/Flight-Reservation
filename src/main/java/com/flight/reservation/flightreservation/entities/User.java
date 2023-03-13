package com.flight.reservation.flightreservation.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "gender")
    private String gender;

    @Column(name = "email")
    private String email;
    @Column(name = "userName")
    private String userName;
    @Column(name = "password")
    private String password;
}
