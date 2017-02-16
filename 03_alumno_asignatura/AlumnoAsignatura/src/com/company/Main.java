package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Alumno> alumnos = new ArrayList<>();
        List<Asignatura> asignaturas = new ArrayList<>();
        int opcion = 0;
        do {
            System.out.println("1. Crear nuevo alumno.\n" +
                    "2. Crear nueva asignatura.\n" +
                    "3. Matricular alumno en asignatura.\n" +
                    "4. Listado de alumnos matriculados en una asignatura.\n" +
                    "5. Listado de asignaturas en las que está matriculado un alumno y total de horas.\n" +
                    "6. Salir");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion){
                case 1: {
                    System.out.print("Introduce el nombre: ");
                    String nombre = br.readLine();
                    System.out.print("Introduce los apellidos: ");
                    String apellidos = br.readLine();
                    System.out.print("Introduce el email: ");
                    String email = br.readLine();
                    Alumno a = new Alumno(nombre, apellidos, email);
                    alumnos.add(a);
                }
                    break;
                case 2: {
                    System.out.print("Introduce el nombre: ");
                    String nombre = br.readLine();
                    System.out.print("Introduce las horas semanales: ");
                    int horas = Integer.parseInt(br.readLine());
                    Asignatura a = new Asignatura(nombre, horas);
                    asignaturas.add(a);
                }
                    break;
                case 3: {
                    int alumno = elegirAlumno(alumnos, br);
                    int asignatura = elegirAsignatura(asignaturas, br);
                    alumnos.get(alumno).addAsignatura(asignaturas.get(asignatura));
                }
                    break;
                case 4: {
                    int asignatura = elegirAsignatura(asignaturas, br);
                    System.out.println("Alumnos matriculados en " + asignaturas.get(asignatura).getNombre());
                    for (Alumno alu : asignaturas.get(asignatura).getAlumnos()) {
                        System.out.println(alu.getNombre() + " " + alu.getApellidos());
                    }
                }
                    break;
                case 5: {
                    int alumno = elegirAlumno(alumnos, br);
                    System.out.println("Asignaturas en las que está matriculado " + alumnos.get(alumno).getNombre() + " " + alumnos.get(alumInt).getApellidos());
                    int totalHoras = 0;
                    for (Asignatura asignat : alumnos.get(alumno).getAsignaturas()) {
                        System.out.println(asignat.getNombre());
                        totalHoras += asignat.getHorasSemanales();
                    }
                    System.out.println("Total horas: " + totalHoras);
                }
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
            }
        }while (opcion!=6);
    }

    public static int elegirAlumno(List<Alumno> alumnos, BufferedReader br) throws IOException {
        System.out.println("Elige un alumno:");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(i+1+" "+alumnos.get(i).getNombre());
        }
        int alumno = Integer.parseInt(br.readLine())-1;
        return alumno;
    }

    public static int elegirAsignatura(List<Asignatura> asignaturas,BufferedReader br ) throws IOException {
        System.out.println("Elige una asignatura:");
        for (int i = 0; i < asignaturas.size(); i++) {
            System.out.println(i+1+" "+asignaturas.get(i).getNombre());
        }
        int asignatura = Integer.parseInt(br.readLine())-1;
        return asignatura;
    }
}
