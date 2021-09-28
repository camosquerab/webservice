package com.sap.unal.webservice.controller;

import com.sap.unal.webservice.entities.Person;
import com.sap.unal.webservice.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("")
    public Person[] getPeople() {
        return personService.getPeople();
    }
}
