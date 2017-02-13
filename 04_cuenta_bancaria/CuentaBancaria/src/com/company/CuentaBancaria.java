package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7FPROG09 on 09/02/2017.
 */
public class CuentaBancaria {
    private String codigoCuenta;
    private List<Titular> titulares;
    private List<Apunte> apuntes;

    public CuentaBancaria(String codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
        titulares = new ArrayList<>();
        apuntes = new ArrayList<>();
    }


    public void borrarCuenta(){
        titulares.clear();
        apuntes.clear();
    }

    public void nuevoApunte(double cantidad){
        Apunte a = new Apunte(cantidad);
        a.setCuentaBancaria(this);
    }

    public void addTitular(Titular titular){
        titulares.add(titular);
        titular.addCuentaBancaria(this);
    }

    public List<Titular> getTitulares() {
        return titulares;
    }

    public List<Apunte> getApuntes() {
        return apuntes;
    }

    public String getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(String codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    public double calcularSaldo(){
        double total = 0;
        for (Apunte apunte: apuntes) {
            total+= apunte.getCantidad();
        }
        return total;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "codigoCuenta='" + codigoCuenta + '\'' +
                '}';
    }
}
