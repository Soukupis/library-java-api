package com.example.Library.dao;

import com.example.Library.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("reservation/postgres")
public interface ReservationRepository extends JpaRepository<Person, Long> {
}
