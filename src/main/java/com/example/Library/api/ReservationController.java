package com.example.Library.api;

import com.example.Library.model.Person;
import com.example.Library.model.Reservation;
import com.example.Library.service.ReservationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/reservation")
@RestController
public class ReservationController {
    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    };

    @GetMapping
    public List<Reservation> getAllReservation(){
        //return reservationService.getReservations();
        return List.of();
    };
    @GetMapping(path = "/{id}")
    public Person getPersonById(@PathVariable("id") Long id){
        //return reservationService.getReservationById(id).orElse(null);
        return new Person();
    }
    @PostMapping
    public void addPerson(@Valid @NonNull @RequestBody Reservation reservation){
        //reservationService.addReservation(book);
    };
    @DeleteMapping(path = "/{id}")
    public void deletePersonById(@PathVariable("id") Long id){
        //reservationService.deleteReservation(id);
    }
    @PutMapping(path = "/{id}")
    public void updatePeron(@PathVariable("id") Long id, @Valid @NonNull @RequestBody Reservation reservation){
        //reservationService.updateReservation(id, person);
    }
}
