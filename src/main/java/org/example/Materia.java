package org.example;

import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public boolean puedeCursar(Alumno alumno){
        return correlativas.stream().allMatch(alumno::evaluarCorrelativa);
    }
}
