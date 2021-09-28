package com.sap.unal.webservice.services;

import com.sap.unal.webservice.entities.Person;
import com.sap.unal.webservice.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public Person[] getPeople() {
        Person[] people = personRepository.findAll().toArray(new Person[0]);
        return people;
    }
}
