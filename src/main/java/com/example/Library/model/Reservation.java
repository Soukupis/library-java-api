package com.example.Library.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Reservation {

    @Id
    @SequenceGenerator(
            name = "reservation_sequence",
            sequenceName = "reservation_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "reservation_sequence"
    )
    public Long id;

    @OneToOne
    public Book book;

    @OneToOne
    public Person person;

    public Date reservationDate;

    public Date returnDate;
}