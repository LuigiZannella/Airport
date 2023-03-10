package bcase.Flight.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingDTO {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateFlight;

    @DateTimeFormat(pattern = "HH:mm:ss")
    private LocalDateTime departureTime;

    @DateTimeFormat(pattern = "HH:mm:ss")
    private LocalDateTime arrivalTime;

    private String departureAirport;

    private String arrivalAirport;

    private String namePassenger;

    private int reservedSeats;
}
