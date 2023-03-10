package bcase.Flight.service;

import bcase.Flight.dto.BookingDTO;
import bcase.Flight.model.Booking;

import java.util.List;

public interface BookingService {

    Booking bookingFlight (BookingDTO bookingDTO);

    List <Booking> getFlightBookings();

    List <Booking> getPassengerBooking(String name);

    boolean deleteBooking(Long id);

}
