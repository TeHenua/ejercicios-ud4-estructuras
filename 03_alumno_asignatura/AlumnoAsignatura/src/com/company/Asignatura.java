package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7FPROG09 on 09/02/2017.
 */
public class Asignatura {
    private String nombre;
    private int horasSemanales;
    private List<Alumno> alumnos;

    public Asignatura(String nombre, int horasSemanales) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
        alumnos = new ArrayList<>();
    }

    public void listarAlumnos() {
        for (Alumno a: alumnos ) {
            System.out.println(a.getNombre() + " " + a.getApellidos());
        }
    }

    public void addAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }
}
