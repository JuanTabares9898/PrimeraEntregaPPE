package com.example.PrimeraEntregaPPE.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PrimeraEntregaPPE.model.Estudiante;
import com.example.PrimeraEntregaPPE.service.EstudianteService;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService repository;

    public EstudianteController(EstudianteService repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<?> registrarEstudiante(@RequestBody Estudiante estudiante) {

        // validar
        if (repository.existsById(estudiante.getId())) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Ya existe un estudiante con ese ID");
        }

        repository.save(estudiante);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(estudiante);
    }

    @GetMapping
    public ResponseEntity<List<Estudiante>> listarEstudiantes() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(repository.findAll());
    }
}