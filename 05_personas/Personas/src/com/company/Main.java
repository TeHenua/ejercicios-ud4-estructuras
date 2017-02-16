package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Persona> personas1 = new HashSet<>();
        Set<Persona> personas2 = new HashSet<>();

        /*do {
            System.out.print("Nombre: ");
            String nombre = br.readLine();
            System.out.print("Dni: ");
            String dni = br.readLine();
            personas1.add(new Persona(nombre,dni));
        }while (personas1.size()<5);

        do{
            System.out.print("Nombre: ");
            String nombre = br.readLine();
            System.out.print("Dni: ");
            String dni = br.readLine();
            personas2.add(new Persona(nombre,dni));
        }while (personas2.size()<5);*/
        personas1.add(new Persona("72747890v","usue"));
        personas1.add(new Persona("35575600m","santi"));
        personas1.add(new Persona("13297882h","rosa"));
        personas1.add(new Persona("12345","urko"));
        personas1.add(new Persona("1","gatito"));
        personas2.add(new Persona("72747890v","usue"));
        personas2.add(new Persona("35575600m","santi"));
        personas2.add(new Persona("5","rosa"));
        personas2.add(new Persona("888","usue"));
        personas2.add(new Persona("90","usue"));


        System.out.println("Todas las personas de los dos grupos, sin duplicados.");
        Set<Persona> personasSinDupli = new HashSet<>();
        personasSinDupli.addAll(personas1);
        personasSinDupli.addAll(personas2);

        for (Persona p: personasSinDupli) {
            System.out.println(p);
        }

        System.out.println("Todas las personas de los dos grupos, con duplicados.");
        List<Persona> personasConDupli = new ArrayList<>(personas1);
        for (Persona p: personas2) {
            personasConDupli.add(p);
        }

        for (Persona p: personasConDupli) {
            System.out.println(p);
        }

        System.out.println("Las personas del primer grupo que no estén también en el segundo.");
        Set<Persona> personasDiferencia = new HashSet<>(personas1);
        personasDiferencia.removeAll(personas2);

        for (Persona p: personasDiferencia) {
            System.out.println(p);
        }

        System.out.println("Las personas que pertenecen a los dos grupos.");
        Set<Persona> personasDos = new HashSet<>(personas1);
        personasDos.retainAll(personas2);

        for (Persona p: personasDos) {
            System.out.println(p);
        }

    }
}
