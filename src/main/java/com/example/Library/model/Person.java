package com.example.Library.model;

import jakarta.persistence.*;

@Entity
@Table
public class Person {

    @Id
    @SequenceGenerator(
            name = "person_sequence",
            sequenceName = "person_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_sequence"
    )
    public Long id;

    public String name;

    public String surname;

    public String email;

    public String phoneNumber;

    public Person(){}

    public Person(String name, String surname, String email, String phoneNumber){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
