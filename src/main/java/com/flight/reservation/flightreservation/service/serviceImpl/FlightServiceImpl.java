package com.flight.reservation.flightreservation.service.serviceImpl;

import com.flight.reservation.flightreservation.dto.FlightDto;
import com.flight.reservation.flightreservation.entities.AirlineInfo;
import com.flight.reservation.flightreservation.entities.Airport;
import com.flight.reservation.flightreservation.entities.Flight;
import com.flight.reservation.flightreservation.repositories.AirlineRepository;
import com.flight.reservation.flightreservation.repositories.AirportRepository;
import com.flight.reservation.flightreservation.repositories.FlightRepository;
import com.flight.reservation.flightreservation.service.FlightService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;
    private final AirportRepository airportRepository;
    private final AirlineRepository airlineRepository;

    public FlightServiceImpl(FlightRepository flightRepository, AirportRepository airportRepository, AirlineRepository airlineRepository) {
        this.flightRepository = flightRepository;
        this.airportRepository = airportRepository;
        this.airlineRepository = airlineRepository;
    }

    @Override
    public String addFlight(FlightDto flightDto) {
        Flight flight = new Flight();
        Optional<Airport> airport = Optional.ofNullable(airportRepository
                .findByName(flightDto.getAirportName()));
        Optional<AirlineInfo> airlineInfo = Optional.ofNullable(airlineRepository
                .findByName(flightDto.getAirLineName()));
        flight.setAirport(airport.get());
        flight.setAirlineInfo(airlineInfo.get());
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
        Optional<Flight> flightOptional = flightRepository.findById(id);
        if(flightOptional.isPresent()) {
            Flight flight =  flightOptional.get();
            Optional<Airport> airport = Optional.ofNullable(airportRepository
                    .findByName(flightDto.getAirportName()));
            Optional<AirlineInfo> airlineInfo = Optional.ofNullable(airlineRepository
                    .findByName(flightDto.getAirLineName()));
            flight.setAirport(airport.get());
            flight.setAirlineInfo(airlineInfo.get());
            flight.setFlightNumber(flightDto.getFlightNumber());
            flight.setFlightDate(flightDto.getFlightDate());
            flight.setFlightTime(flightDto.getFlightTime());
            flight.setDestination(flightDto.getDestination());
            flight.setDuration(flightDto.getDuration());
            flight.setOrigin(flightDto.getOrigin());
            flightRepository.save(flight);
        }
        return "Flight Updated Successfully";

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
