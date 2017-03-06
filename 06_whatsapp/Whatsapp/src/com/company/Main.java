package com.company;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Contacto> listado = new LinkedHashMap<Integer, Contacto>();
        int opcion;

        listado.put(666777777,new Contacto("usue","urruela","tehenua@gmail.com"));
        listado.put(666778888,new Contacto("lalal","urruela","tehenua@gmail.com"));
        listado.put(666779999,new Contacto("ososos","urruela","tehenua@gmail.com"));


        do {
            System.out.println("     Gestión de contactos\n" +
                    "1. Nuevo contacto.\n" +
                    "2. Eliminar contacto.\n" +
                    "     Búsqueda\n" +
                    "3. Buscar contacto por número de teléfono.\n" +
                    "4. Buscar contacto por nombre.\n" +
                    "     Listados\n" +
                    "5. Listado de todos los contactos, tal como se han añadido.\n" +
                    "6. Listado de todos los contactos, ordenados por número de teléfono.\n" +
                    "7. Salir");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1: {
                    System.out.print("Nª de teléfono: ");
                    Integer numero = Integer.parseInt(br.readLine());
                    System.out.print("Nombre: ");
                    String nombre = br.readLine();
                    System.out.print("Apellidos: ");
                    String apellidos = br.readLine();
                    System.out.print("Email: ");
                    String email = br.readLine();
                    Contacto c = new Contacto(nombre, apellidos, email);
                    listado.put(numero, c);
                }
                break;
                case 2: {
                    System.out.print("Nª de teléfono: ");
                    Integer numero = Integer.parseInt(br.readLine());
                    listado.remove(numero);
                }
                break;
                case 3: {
                    System.out.print("Nª de teléfono: ");
                    Integer numero = Integer.parseInt(br.readLine());
                    System.out.println(listado.get(numero));
                }
                break;
                case 4: {
                    System.out.print("Nombre: ");
                    String nombre = br.readLine();
                    for (Map.Entry<Integer, Contacto> entry : listado.entrySet()) {
                        if (entry.getValue().getNombre().equalsIgnoreCase(nombre)){
                            System.out.println("Nombre: "+entry.getValue().getNombre());
                            System.out.println("Apellidos: "+entry.getValue().getApellidos());
                            System.out.println("Email: "+entry.getValue().getEmail());
                            System.out.println("Teléfono: "+entry.getKey());
                        }
                    }
                }
                break;
                case 5:{
                    for (Map.Entry<Integer, Contacto> entry : listado.entrySet()) {
                        System.out.println("Telefono "+entry.getKey()+" Nombre "+entry.getValue().getNombre()
                        +" Apellidos "+entry.getValue().getApellidos()+" Email "+entry.getValue().getEmail());
                    }
                }
                    break;
                case 6:{
                    Map<Integer,Contacto> ordenados = new TreeMap<>();


                }
                break;
            }
        }while (opcion!=7);

    }
}
