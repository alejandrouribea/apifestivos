package com.udea.apifestivos.controller;


import com.udea.apifestivos.services.FestivoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;



@RestController
@CrossOrigin
@RequestMapping("/festivos/")
public class Controller {

    @Autowired
    private FestivoServicio servicio;

    @GetMapping("/{año}/{mes}/{dia}")
    public ResponseEntity<String> Festivo(@PathVariable int año, @PathVariable int mes, @PathVariable int dia) {
        if (servicio.esFechaValida(año + "-" + mes + "-" + dia)) {

            Date fecha = new Date(año - 1900, mes - 1, dia);

            if (servicio.esFestivo(fecha)) {
                return ResponseEntity.ok("Es festivo");
            }
            else{
                return ResponseEntity.ok("No es festivo");
            }

        } else {
            return ResponseEntity.badRequest().body("Fecha NO valida");
        }
    }

}

