package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TeHenua on 06/02/2017.
 */
public class Empresa {
    private String nombre;
    private String anyoFundacion;
    private List<Empleado> empleados;

    public Empresa(String nombre, String anyoFundacion) {
        this.nombre = nombre;
        this.anyoFundacion = anyoFundacion;
        empleados = new ArrayList<>();
    }

    public void addEmpelado(Empleado e){
        empleados.add(e);
        e.setEmpresa(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnyoFundacion() {
        return anyoFundacion;
    }

    public void setAnyoFundacion(String anyoFundacion) {
        this.anyoFundacion = anyoFundacion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", anyoFundacion='" + anyoFundacion + '\'' +
                '}';
    }
}
