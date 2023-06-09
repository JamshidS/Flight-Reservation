package com.flight.reservation.flightreservation.controller;


import com.flight.reservation.flightreservation.dto.FlightDto;
import com.flight.reservation.flightreservation.entities.Airport;
import com.flight.reservation.flightreservation.entities.Flight;
import com.flight.reservation.flightreservation.service.FlightService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Flushable;
import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addFlight(@RequestBody FlightDto flightDto){
        return new ResponseEntity<>(flightService.addFlight(flightDto), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateFlight(@PathVariable Long id, @RequestBody FlightDto flightDto){
        return new ResponseEntity<>(flightService.updateFlight(flightDto,id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFlight(@PathVariable Long id){
        return new ResponseEntity<>(flightService.deleteFlight(id),HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Flight> getById(@PathVariable Long id){
        return new ResponseEntity<>(flightService.getById(id),HttpStatus.OK);
    }

    @PostMapping("/search")
    public ResponseEntity<Flight> getFlightByAirport(@RequestBody Airport airport){
        return new ResponseEntity<>(flightService.getFlightByAirPort(airport),HttpStatus.OK);
    }

    @PostMapping("/search/list")
    public ResponseEntity<List<Flight>> getFlightsByAirport(@RequestBody Airport airport){
        return new ResponseEntity<>(flightService.getFlightsByAirport(airport),HttpStatus.OK);
    }

    @PostMapping("search/date")
    public ResponseEntity<List<Flight>> getByDate(@RequestBody String date){
        return new ResponseEntity<>(flightService.getByDate(date),HttpStatus.OK);
    }
}
