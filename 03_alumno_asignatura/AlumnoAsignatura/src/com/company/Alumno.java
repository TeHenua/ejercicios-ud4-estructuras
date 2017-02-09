package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7FPROG09 on 09/02/2017.
 */
public class Alumno {
    private String nombre;
    private String apellidos;
    private String email;
    private List<Asignatura> asignaturas;

    public Alumno(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        asignaturas = new ArrayList<>();
    }

    public void addAsignatura(Asignatura asignatura){
        asignaturas.add(asignatura);
        asignatura.addAlumno(this);
    }


    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
