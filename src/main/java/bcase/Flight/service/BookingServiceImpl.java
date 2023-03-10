package bcase.Flight.service;

import bcase.Flight.model.Booking;
import bcase.Flight.model.Flight;
import bcase.Flight.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository repo;


    @Override
    public Optional<Booking> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Booking> findAll() {
        return null;
    }

    @Override
    public boolean bookFlight(String flightNumber, Date date, String passengerName, int numSeats) {
        // Verifica che il numero di posti richiesti sia valido
        if (numSeats <= 0) {

        if (!flight.hasAvailableSeats(numSeats)) {
            return false;
        }

        Booking booking = new Booking(passengerName, numSeats);
        
        flight.addBooking(booking);

        // Restituisci true per indicare che la prenotazione è andata a buon fine
        return true;
    }

    @Override
    public List<Booking> FlightBookings(String flightNumber, Date flightDate) {
        return null;
    }

    @Override
    public int AvailableSeats(String flightNumber, Date date) {
        return 0;
    }

    @Override
    public List<Flight> Flights(String departureAirport, String arrivalAirport, Date date) {
        return null;
    }

    @Override
    public List<Booking> findByPassengerName(String passengerName) {
        return null;
    }

    @Override
    public boolean deleteBookingById(Long id) {
        return false;
    }
}
