package bcase.Flight.service;

import bcase.Flight.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl {

    @Autowired
    private BookingRepository repo;


}
