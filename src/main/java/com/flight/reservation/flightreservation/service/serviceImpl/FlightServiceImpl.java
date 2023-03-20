package com.flight.reservation.flightreservation.service.serviceImpl;

import com.flight.reservation.flightreservation.dto.FlightDto;
import com.flight.reservation.flightreservation.entities.Airport;
import com.flight.reservation.flightreservation.entities.Flight;
import com.flight.reservation.flightreservation.repositories.FlightRepository;
import com.flight.reservation.flightreservation.service.FlightService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;

    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public String addFlight(FlightDto flightDto) {
        Flight flight = new Flight();
        flight.setFlightNumber(flightDto.getFlightNumber());
        flight.setFlightDate(flightDto.getFlightDate());
        flight.setFlightTime(flightDto.getFlightTime());
        flight.setDestination(flightDto.getDestination());
        flight.setDuration(flightDto.getDuration());
        flight.setOrigin(flightDto.getOrigin());
        flightRepository.save(flight);
        return "Flight Added Successfully";
    }

    @Override
    public String updateFlight(FlightDto flightDto, Long id) {
        return null;
    }

    @Override
    public List<Flight> getAll() {
        return flightRepository.findAll();
    }

    @Override
    public String deleteFlight(Long id) {
        flightRepository.deleteById(id);
        return "Flight Deleted Successfully";
    }

    @Override
    public Flight getFlightByAirPort(Airport airport) {
        return null;
    }

    @Override
    public List<Flight> getFlightsByAirport(Airport airport) {
        return null;
    }

    @Override
    public List<Flight> getByDate(String date) {
        return null;
    }

    @Override
    public List<Flight> getByFlightNumber(String flightNumber) {
        return null;
    }
}
