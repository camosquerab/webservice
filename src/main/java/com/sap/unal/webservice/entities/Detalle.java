package com.sap.unal.webservice.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="Detalle")
public class Detalle {
    @Column(name="DET_PREFIJO")
    private String DET_PREFIJO;

    @Id
    @Column(name="DET_NRORECIBO")
    private String DET_NRORECIBO;

    @Column(name="DET_SEDE")
    private String DET_SEDE;

    @Column(name="DET_NITEMES")
    private String DET_NITEMES;

    @Column(name="DET_CANTIDA")
    private Long DET_CANTIDA;

    @Column(name="DET_VLRUNIT")
    private Long DET_VLRUNIT;

    @Column(name="DET_PCT_DESC")
    private Long DET_PCT_DESC;

    @Column(name="DET_CODIGO")
    private String DET_CODIGO;

    @Column(name="DET_NOMBRE")
    private String DET_NOMBRE;

    @Column(name="DET_DESCRIP")
    private String DET_DESCRIP;

    @Column(name="DET_DOCU_HIJO")
    private String DET_DOCU_HIJO;
}

