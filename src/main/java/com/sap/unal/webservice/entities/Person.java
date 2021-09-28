package com.sap.unal.webservice.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Person")
public class Person {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name="nombres")
    private String nombres;



}
