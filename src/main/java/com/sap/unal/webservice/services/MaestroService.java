package com.sap.unal.webservice.services;

import com.sap.unal.webservice.entities.Maestro;
import com.sap.unal.webservice.repositories.MaestroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class MaestroService {
    @Autowired
    MaestroRepository maestroRepository;

    @Autowired
    EntityManager entityManager;

    public List findByQuery(String date){
        String query = "select s.* from (select @p1\\:='%s' p) parm , Maestro s";
        String sql = String.format(query, date);
        List maestro = entityManager.createNativeQuery(sql).getResultList();
        System.out.println(maestro.toString());
        return maestro;
    }
}
