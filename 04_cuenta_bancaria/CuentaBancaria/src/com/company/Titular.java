package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7FPROG09 on 09/02/2017.
 */
public class Titular {
    private String nombre;
    private String apellidos;
    private String dni;
    private String fechaAlta;
    private List<CuentaBancaria> cuentaBancarias;

    public Titular(String nombre, String apellidos, String dni, String fechaAlta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaAlta = fechaAlta;
        cuentaBancarias =  new ArrayList<>();
    }

    public void borrarEnlaceCuenta(CuentaBancaria cuenta){
        cuentaBancarias.remove(cuenta);
    }

    public void addCuentaBancaria(CuentaBancaria cuentaBancaria){
        cuentaBancarias.add(cuentaBancaria);
    }

    public List<CuentaBancaria> getCuentaBancarias() {
        return cuentaBancarias;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void imprimirSaldos(){
        for (CuentaBancaria cb: cuentaBancarias) {
            System.out.println(cb);
            System.out.println("Saldo ->"+ cb.calcularSaldo());
        }
    }

    @Override
    public String toString() {
        return "Titular{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaAlta='" + fechaAlta + '\'' +
                '}';
    }
}
