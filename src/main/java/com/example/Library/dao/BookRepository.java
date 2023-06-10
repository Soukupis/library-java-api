package com.example.Library.dao;

import com.example.Library.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("book/postgres")
public interface BookRepository extends JpaRepository<Person, Long> {
}