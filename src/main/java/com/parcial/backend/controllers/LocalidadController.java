package com.parcial.backend.controllers;


import com.parcial.backend.entities.Localidad;
import com.parcial.backend.services.LocalidadServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad,LocalidadServiceImpl>{
    @GetMapping("/search")
    public ResponseEntity<?> searchNativo(@RequestParam String filtro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchJPQLnombrado(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error, por favor intente mas tarde\"}");
        }
    }

    @GetMapping("/searchPaged")
    public ResponseEntity<?> searchNativo(@RequestParam String filtro, Pageable pageable){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchJPQLnombrado(filtro, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error, por favor intente mas tarde\"}");
        }
    }
}
