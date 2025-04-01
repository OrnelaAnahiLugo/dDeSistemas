package org.example;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribirse;

    public boolean aprobada(){
        return this.materiasAInscribirse.stream().allMatch(materia -> materia.puedeCursar(this.alumno));
    }
}
