package com.example.Library.api;

import com.example.Library.model.Book;
import com.example.Library.model.Person;
import com.example.Library.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    };

    @GetMapping
    public List<Person> getPeople(){
        //return reservationService.getPeople();
        return List.of();
    };

    @GetMapping(path = "/{id}")
    public Person getPersonById(@PathVariable("id") Long id){
        //return personService.getPersonById(id).orElse(null);
        return new Person();
    }
    @PostMapping
    public void addPerson(@Valid @NonNull @RequestBody Person person){
        //personService.addPerson(book);
    };
    @DeleteMapping(path = "/{id}")
    public void deletePersonById(@PathVariable("id") Long id){
        //personService.deletePerson(id);
    }
    @PutMapping(path = "/{id}")
    public void updatePeron(@PathVariable("id") Long id, @Valid @NonNull @RequestBody Person person){
        //personService.updatePerson(id, person);
    }
}
