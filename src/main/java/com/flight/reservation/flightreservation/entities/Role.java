package com.flight.reservation.flightreservation.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="name")
    private String name;
    @Column(name = "roleType")
    private String rolType;

    @ManyToMany(cascade = {CascadeType.MERGE},
            mappedBy = "roles")
    private Set<User> users;
}
