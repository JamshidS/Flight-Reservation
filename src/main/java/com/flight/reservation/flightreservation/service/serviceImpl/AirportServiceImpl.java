package com.flight.reservation.flightreservation.service.serviceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flight.reservation.flightreservation.entities.Airport;
import com.flight.reservation.flightreservation.repositories.AirportRepository;
import com.flight.reservation.flightreservation.service.AirPortService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirportServiceImpl implements AirPortService {
    private final AirportRepository airportRepository;
    private final ObjectMapper objectMapper;

    public AirportServiceImpl(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public String addAirPort(Airport airport) {
        airportRepository.save(airport);
        return "saved Successfully";
    }

    @Override
    public List<Airport> getAll() {
        return airportRepository.findAll();
    }

    @Override
    public Airport getAirportById(Long id) {
        Optional<Airport> airport = airportRepository.findById(id);
        if(!airport.isPresent()){
            throw new RuntimeException("Airport can't found");
        }
        return airport.get();
    }

    @Override
    public String deleteAirportById(Long id) {
        airportRepository.deleteById(id);
        return "Deleted Successfully";
    }

    @Override
    public Airport findAirportByName(String name) {
        return airportRepository.findByName(name);
    }
}
