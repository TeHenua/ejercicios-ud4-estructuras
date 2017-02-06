package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Ticket t = new Ticket();
        String continuar="";
        do{
            System.out.print("Introduce el nombre del producto: ");
            String nombre = br.readLine();
            System.out.print("Número de unidades: ");
            int numero = Integer.parseInt(br.readLine());
            System.out.print("Precio/unidad: ");
            float precio = Float.parseFloat(br.readLine());
            Linea l = new Linea(nombre,numero,precio);
            t.addLinea(l);
            System.out.println("¿Quieres continuar? (s|n)");
            continuar = br.readLine();
        }while (continuar.equalsIgnoreCase("s"));

        System.out.println("TICKET");
        for (Linea l: t.getLineas()) {
            System.out.println(l.getNombre()+" --- "+l.getUnidades()+" --- "+l.getPrecio());
        }
        System.out.println("-------------------");
        System.out.println("TOTAL --> "+t.calcularTotal());

    }
}
