package com.example.PrimeraEntregaPPE.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.PrimeraEntregaPPE.model.Estudiante;

@Repository
public class EstudianteService {

    private List<Estudiante> estudiantes = new ArrayList<>();

    public List<Estudiante> findAll() {
        return estudiantes;
    }

    public void save(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public boolean existsById(String id) {
        for (Estudiante e : estudiantes) {
            if (e.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}