package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Empresa> empresas = new ArrayList<>();

        int opcion=0;
        do{
            System.out.println("1 Crear nueva empresa.\n" +
                    "2 Añadir empleado a empresa ya existente.\n" +
                    "3 Listado de empresas.\n" +
                    "4 Listado detallado de empresas y empleados.\n" +
                    "5 Salir");
            opcion=Integer.parseInt(br.readLine());
            switch (opcion){
                case 1:
                    anadirEmpresa(br, empresas);
                    break;
                case 2:
                    anadirEmpleado(br, empresas);
                    break;
                case 3:
                    for (Empresa e: empresas) {
                        System.out.println(e);
                    }
                    break;
                case 4:
                    for (Empresa emp: empresas ) {
                        emp.imprimir();
                    }
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
            }
        }while (opcion!=5);
    }

    public static void anadirEmpresa(BufferedReader br, List<Empresa> empresas) throws IOException {
        System.out.print("Introduce el nombre: ");
        String nombre = br.readLine();
        System.out.print("Año de fundación: ");
        String anyo = br.readLine();
        Empresa e = new Empresa(nombre,anyo);
        empresas.add(e);
    }

    public static void anadirEmpleado(BufferedReader br, List<Empresa> empresas) throws IOException {
        System.out.print("Introduce el nombre: ");
        String nombre = br.readLine();
        System.out.print("Introduce los apellidos: ");
        String apellidos = br.readLine();
        System.out.print("Introduce la fecha de nacimiento: ");
        String fechaNacimiento = br.readLine();
        System.out.print("Introduce la fecha de contrato: ");
        String fechaContrato = br.readLine();
        boolean correcto = false;
        do {
            System.out.print("Introduce el nombre de la empresa: ");
            String nombreEm = br.readLine();
            for (int i = 0; i < empresas.size() && !correcto; i++) {
                if (empresas.get(i).getNombre().equalsIgnoreCase(nombreEm)){
                    correcto = true;
                    empresas.get(i).addEmpelado(new Empleado(nombre,apellidos,fechaNacimiento,fechaContrato));
                }else {
                    correcto = false;
                }
            }
        }while (!correcto);
    }
}
