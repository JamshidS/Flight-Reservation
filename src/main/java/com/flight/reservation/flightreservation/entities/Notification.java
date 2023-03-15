package com.flight.reservation.flightreservation.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;

@Table(name = "notification")
@Entity
@Data
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "time")
    private LocalTime time;
    @Column(name = "content")
    private String content;


}
