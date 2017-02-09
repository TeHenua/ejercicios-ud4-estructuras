package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<CuentaBancaria> cuentaBancarias = new ArrayList<>();
        List<Titular> titulares = new ArrayList<>();
        String opcion;
        do {
            System.out.println("1.Titular\n" +
                    "  i. Nuevo titular\n" +
                    "2. Cuenta bancaria\n" +
                    "  i. Nueva cuenta\n" +
                    "  ii. Nuevo apunte\n" +
                    "  iii. Borrar cuenta\n" +
                    "3. Consultas\n" +
                    "  i. Dado un titular, saldo de todas sus cuentas\n" +
                    "  ii. Dada una cuenta, titulares asociados\n" +
                    "4. Salir");
            opcion = br.readLine();
            switch (opcion){
                case "1i":      //Nuevo titular
                    System.out.print("Nombre: ");
                    String nombre = br.readLine();
                    System.out.print("Apellidos: ");
                    String apellidos = br.readLine();
                    System.out.print("DNI: ");
                    String dni = br.readLine();
                    System.out.print("Fecha de alta: ");
                    String fechaAlta = br.readLine();
                    Titular titular = new Titular(nombre, apellidos, dni, fechaAlta);
                    titulares.add(titular);
                    break;
                case "2i":      //Nueva cuenta y asociar a titular
                    System.out.println("Escribe el dni del titular");
                    String dniT = br.readLine();


                    break;
                case "2ii":

                    break;
                case "2iii":

                    break;
                case "3i":

                    break;
                case "3ii":

                    break;
                case "4":
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("No he entendido la opción");
                    break;
            }
        }while(!opcion.equals("4"));
    }
}
