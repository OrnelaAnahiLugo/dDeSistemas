package org.example;

import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas;

    public boolean evaluarCorrelativa(Materia correlativa){
        return this.materiasAprobadas.contains(correlativa);
    }
}
