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

        int opcion;

        do{
            System.out.println("Empresa\n" +
                    "1 Crear nueva empresa\n" +
                    "2 Borrar una empresa\n" +
                    "Añadir empleados (a una empresa)\n" +
                    "3 Añadir operario\n" +
                    "4 Añadir directivo\n" +
                    "5 Listar empleados (de la empresa)\n" +
                    "Listados\n" +
                    "6 Todas las empresas\n" +
                    "7 Todos los empleados\n" +
                    "8 Listado por empresa y empleado\n" +
                    "Salir");
            opcion = Integer.parseInt(br.readLine());
            switch (opcion){
                case 1:{        //Crear una nueva empresa
                    System.out.println("Nombre: ");
                    String nombre = br.readLine();
                    System.out.println("Año de fundación: ");
                    String añoFundacion = br.readLine();
                    empresas.add(new Empresa(nombre,añoFundacion));
                }
                break;
                case 2:{        //Borrar una empresa
                    System.out.println("Elige una empresa");
                    for (int i = 0; i < empresas.size(); i++) {
                        System.out.println(i+1+" "+empresas.get(i));
                    }
                    int empresaSel = Integer.parseInt(br.readLine())-1;
                    empresas.get(empresaSel).limpiarEmpleados();
                    empresas.remove(empresaSel);
                }
                break;
                case 3:{        //Añadir operario
                    System.out.println("Elige una empresa");
                    for (int i = 0; i < empresas.size(); i++) {
                        System.out.println(i+1+" "+empresas.get(i));
                    }
                    int empresaSel = Integer.parseInt(br.readLine())-1;

                    System.out.println("Nombre: ");
                    String nombre = br.readLine();
                    System.out.println("Apellidos: ");
                    String apellidos = br.readLine();
                    System.out.println("Fecha de nacimiento: ");
                    String fechaNacimiento = br.readLine();
                    System.out.println("Fecha de contrato: ");
                    String fechaContrato = br.readLine();
                    System.out.println("Salario/hora: ");
                    Double salario = Double.parseDouble(br.readLine());
                    System.out.println("Horas contrato");
                    int horas = Integer.parseInt(br.readLine());

                    empresas.get(empresaSel).addEmpleado(new Operario(nombre, apellidos,fechaNacimiento, fechaContrato,salario,horas));
                }
                break;
                case 4:{        //Añadir directivo
                    System.out.println("Elige una empresa");
                    for (int i = 0; i < empresas.size(); i++) {
                        System.out.println(i+1+" "+empresas.get(i));
                    }
                    int empresaSel = Integer.parseInt(br.readLine())-1;

                    System.out.println("Nombre: ");
                    String nombre = br.readLine();
                    System.out.println("Apellidos: ");
                    String apellidos = br.readLine();
                    System.out.println("Fecha de nacimiento: ");
                    String fechaNacimiento = br.readLine();
                    System.out.println("Fecha de contrato: ");
                    String fechaContrato = br.readLine();
                    System.out.println("Salario anual: ");
                    Double salarioAnual = Double.parseDouble(br.readLine());
                    System.out.println("Bonus personal: ");
                    Double bonus = Double.parseDouble(br.readLine());

                    empresas.get(empresaSel).addEmpleado(new Directivo(nombre, apellidos,fechaNacimiento, fechaContrato,salarioAnual,bonus));
                }
                break;
                case 5:{        //Listar empleados de la empresa
                    System.out.println("Elige una empresa");
                    for (int i = 0; i < empresas.size(); i++) {
                        System.out.println(i+1+" "+empresas.get(i));
                    }
                    int empresaSel = Integer.parseInt(br.readLine())-1;

                    empresas.get(empresaSel).listarEmpleados();
                }
                break;
                case 6:{        //Todas las empresas
                    for (Empresa e: empresas) {
                        System.out.println(e);
                    }
                }
                break;
                case 7:{        //Todos los empleados
                    for (Empresa e: empresas) {
                        e.listarEmpleados();
                    }
                }
                break;
                case 8:{        //Listado por empresa y empleado
                    for (Empresa e: empresas) {
                        System.out.println(e);
                        e.listarEmpleados();
                    }
                }
                break;
            }
        }while (opcion!=9);
    }
}
