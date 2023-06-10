package com.example.Library.dao;

import com.example.Library.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("person/postgres")
public interface PersonRepository extends JpaRepository<Person, Long> {
}
