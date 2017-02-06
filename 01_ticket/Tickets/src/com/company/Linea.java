package com.company;

/**
 * Created by TeHenua on 06/02/2017.
 */
public class Linea {

    private String nombre;
    private int unidades;
    private float precio;
    private Ticket ticket;

    public Linea(String nombre, int unidades, float precio) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.precio = precio;
    }

    public void addTicket(Ticket t){
        this.ticket= t;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Linea{" +
                "nombre='" + nombre + '\'' +
                ", unidades=" + unidades +
                ", precio=" + precio +
                '}';
    }


}
