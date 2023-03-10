package bcase.Flight.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table (name="booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(length = 30, nullable = false)
    @NotEmpty(message = "Questo campo è obbligatorio")
    private Date dateFlight;
    @DateTimeFormat(pattern = "HH:mm:ss")
    @Column(length = 30, nullable = false)
    @NotEmpty(message = "Questo campo è obbligatorio")
    private LocalDateTime departureTime;
    @DateTimeFormat(pattern = "HH:mm:ss")
    @Column(nullable = false)
    @NotEmpty(message = "Questo campo è obbligatorio")
    private LocalDateTime arrivalTime;
    @Column(length = 30, nullable = false)
    @NotEmpty(message = "Questo campo è obbligatorio")
    private String departureAirport;
    @Column(length = 30, nullable = false)
    @NotEmpty(message = "Questo campo è obbligatorio")
    private String arrivalAirport;
    @Column(length = 30, nullable = false)
    @NotEmpty(message = "Questo campo è obbligatorio")
    private String namePassenger;
    @NotEmpty(message = "Questo campo è obbligatorio")
    private int reservedSeats;

}
