package com.sap.unal.webservice.repositories;

import com.sap.unal.webservice.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
