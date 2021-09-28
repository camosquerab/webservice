package com.sap.unal.webservice.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="Maestro")
public class Maestro {

    @Column(name="ENC_PREFIJO")
    private String ENC_PREFIJO;

    @Id
    @Column(name="ENC_NRORECIB")
    private String ENC_NRORECIB;

    @Column(name="ENC_SEDE")
    private String ENC_SEDE;

    @Column(name="ENC_VIGENCIA")
    private String ENC_VIGENCIA;

    @Column(name="ENC_NITEMES")
    private String ENC_NITEMES;

    @Column(name="ENC_NOMBRESEDE")
    private String ENC_NOMBRESEDE;

    @Column(name="ENC_EMPRESAQUIPU")
    private String ENC_EMPRESAQUIPU;

    @Column(name="ENC_FECEMIC")
    private String ENC_FECEMIC;

    @Column(name="ENC_TIPODOC")
    private String ENC_TIPODOC;

    @Column(name="ENC_FORMAPAGO")
    private String ENC_FORMAPAGO;

    @Column(name="ENC_FECPAGO")
    private String ENC_FECPAGO;

    @Column(name="ENC_MEDIOPAGO")
    private String ENC_MEDIOPAGO;

    @Column(name="ENC_DESCUENTO")
    private String ENC_DESCUENTO;

    @Column(name="ENC_SUBTOTAL")
    private String ENC_SUBTOTAL;

    @Column(name="ENC_TOTAL")
    private String ENC_TOTAL;

    @Column(name="ENC_OBSERVACIONES")
    private String ENC_OBSERVACIONES;

    @Column(name="ENC_DATOS_PAGO")
    private String ENC_DATOS_PAGO;

    @Column(name="ENC_CIUDAD_SEDE")
    private String ENC_CIUDAD_SEDE;

    @Column(name="ENC_DIR_SEDE")
    private String ENC_DIR_SEDE;

    @Column(name="ENC_TELEF_SEDE")
    private String ENC_TELEF_SEDE;

    @Column(name="ENC_EMAIL_SEDE_EMISION")
    private String ENC_EMAIL_SEDE_EMISION;

    @Column(name="ENC_CLINATU")
    private String ENC_CLINATU;

    @Column(name="ENC_CLINOMB")
    private String ENC_CLINOMB;

    @Column(name="ENC_CLI_TIPOID")
    private String ENC_CLI_TIPOID;

    @Column(name="ENC_CLI_NUMID")
    private String ENC_CLI_NUMID;

    @Column(name="ENC_CLICIUDAD")
    private String ENC_CLICIUDAD;

    @Column(name="ENC_CLIDIR")
    private String ENC_CLIDIR;

    @Column(name="ENC_CLITELEF")
    private String ENC_CLITELEF;

    @Column(name="ENC_CLIEMAIL")
    private String ENC_CLIEMAIL;

    @Column(name="ENC_CLIRESPFIS")
    private String ENC_CLIRESPFIS;

    @Column(name="ENC_CLIRESPIVA")
    private String ENC_CLIRESPIVA;

    @Column(name="ENC_DOCU_HIJO")
    private String ENC_DOCU_HIJO;

    @Column(name="ENC_COD_PRESTADOR")
    private String ENC_COD_PRESTADOR;

    @Column(name="ENC_TIPODOC_USUARIO")
    private String ENC_TIPODOC_USUARIO;

    @Column(name="ENC_NUM_IDENTIFICACION")
    private String ENC_NUM_IDENTIFICACION;

    @Column(name="ENC_PRIMER_APELLIDO")
    private String ENC_PRIMER_APELLIDO;

    @Column(name="ENC_SEGUNDO_APELLIDO")
    private String ENC_SEGUNDO_APELLIDO;

    @Column(name="ENC_PRIMER_NOMBRE")
    private String ENC_PRIMER_NOMBRE;

    @Column(name="ENC_SEGUNDO_NOMBRE")
    private String ENC_SEGUNDO_NOMBRE;

    @Column(name="ENC_TIPO_USUARIO")
    private String ENC_TIPO_USUARIO;

    @Column(name="ENC_MODALIDAD_CONTRATO")
    private String ENC_MODALIDAD_CONTRATO;

    @Column(name="ENC_COBERTURA")
    private String ENC_COBERTURA;

    @Column(name="ENC_NUM_AUTORIZACION")
    private String ENC_NUM_AUTORIZACION;

    @Column(name="ENC_NUM_MIPRES")
    private String ENC_NUM_MIPRES;

    @Column(name="ENC_NUM_ENTREGA_MIPRES")
    private String ENC_NUM_ENTREGA_MIPRES;

    @Column(name="ENC_NUM_CONTRATO")
    private String ENC_NUM_CONTRATO;

    @Column(name="ENC_POLIZA")
    private String ENC_POLIZA;

    @Column(name="ENC_COPAGO")
    private String ENC_COPAGO;

    @Column(name="ENC_CUOTA_MODERADORA")
    private String ENC_CUOTA_MODERADORA;

    @Column(name="ENC_CUOTA_RECUPERACION")
    private String ENC_CUOTA_RECUPERACION;

    @Column(name="ENC_PAGOS_COMPARTIDOS")
    private String ENC_PAGOS_COMPARTIDOS;
}
