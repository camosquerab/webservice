package com.sap.unal.webservice.services;

import com.sap.unal.webservice.entities.Detalle;
import com.sap.unal.webservice.repositories.DetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class DetalleService {

    @Autowired
    DetalleRepository detalleRepository;

    public List findByQuery(String date){
        List<Detalle> detalle = detalleRepository.findDetalle(date);
        return detalle;
    }
}
