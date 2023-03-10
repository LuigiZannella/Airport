package bcase.Flight.service;

import bcase.Flight.model.Booking;
import bcase.Flight.model.Flight;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface BookingService {
    Optional<Booking> findById(Long id);

    List<Booking> findAll();

    boolean bookFlight(String flightNumber, Date date, String passengerName, int numSeats);

    // Restitusce una lista di tutte le prenotazioni di un volo
    List<Booking> FlightBookings(String flightNumber, Date flightDate);

    // Restituisce quanti posti disponibili ha quel volo
    int AvailableSeats (String flightNumber, Date date);

    // Restitusce i voli di una data specifica
    List<Flight> Flights (String departureAirport, String arrivalAirport, Date date);

    // Restituisce una lista delle prenotazioni effettuate dal passeggero
    List<Booking> findByPassengerName(String passengerName);

    boolean deleteBookingById(Long id);




}