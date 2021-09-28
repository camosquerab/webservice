package com.sap.unal.webservice.controller;

import com.sap.unal.webservice.entities.Maestro;
import com.sap.unal.webservice.services.MaestroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maestro")
public class MaestroController {

    @Autowired
    MaestroService maestroService;

    @GetMapping(path = "/date", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object findByQuery(@RequestParam("date") String date) {

        try {
            System.out.println("date: !!!!!!" + date);
            return maestroService.findByQuery(date);
        } catch (Exception e) {
            return e;
        }
    }

}
