package com.flight.reservation.flightreservation.controller;


import com.flight.reservation.flightreservation.dto.FlightDto;
import com.flight.reservation.flightreservation.service.FlightService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
