package bcase.Flight.controller;

import bcase.Flight.dto.BookingDTO;
import bcase.Flight.model.Booking;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping
public interface FlightBookingController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    ResponseEntity<Booking> save (@RequestBody BookingDTO bookingDTO);


}
