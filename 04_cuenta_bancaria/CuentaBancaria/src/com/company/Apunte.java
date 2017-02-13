package com.company;

import java.util.Date;

/**
 * Created by 7FPROG09 on 09/02/2017.
 */
public class Apunte {
    private double cantidad;
    private String fecha;
    private CuentaBancaria cuentaBancaria;

    public Apunte(double cantidad) {
        this.cantidad = cantidad;
        Date fechaD = new Date();
        fecha = fechaD.getDay()+"/"+fechaD.getMonth()+"/"+(fechaD.getYear()-100);
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public String toString() {
        return "Apunte{" +
                "cantidad=" + cantidad +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
