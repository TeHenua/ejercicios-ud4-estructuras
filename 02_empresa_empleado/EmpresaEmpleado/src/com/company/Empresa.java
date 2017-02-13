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

    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Año de fundación: "+anyoFundacion);
        System.out.println("Empleados:");
        for (Empleado e: empleados ) {
            System.out.println("  Nombre: "+e.getNombre());
            System.out.println("  Apellidos: "+e.getApellidos());
            System.out.println("  Fecha de nacimiento: "+e.getFechaNacimiento());
            System.out.println("  Fecha de contratación: "+e.getFechaContrato());
        }
    }

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
