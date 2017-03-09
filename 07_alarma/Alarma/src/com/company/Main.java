package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pin = ThreadLocalRandom.current().nextInt(1, 9999);
        Alarma a = new Alarma(pin,false);
        int sensores = ThreadLocalRandom.current().nextInt(1,5);
        for (int i = 0; i < sensores; i++) {
            int umbral = ThreadLocalRandom.current().nextInt(1,100);
            a.addSensores(new SensorMovimiento(umbral));
        }

        int opcion;

        System.out.println("Elige nº de teléfono de aviso:");
        int telefono = Integer.parseInt(br.readLine());
        a.setTelefonoAviso(telefono);

        do{
            System.out.println("1.- Activar alarma\n" +
                    "2.- Desactivar alarma (necesario PIN)\n" +
                    "3.- Consultar sensores\n" +
                    "4.- Salir");
            opcion=Integer.parseInt(br.readLine());
            switch (opcion){
                case 1:{
                    a.activar();
                }
                break;
                case 2:{
                    for (int i = 3; i >0 && a.isActivada(); i--) {
                        System.out.println("Quedan "+i+" intentos");
                        pin = Integer.parseInt(br.readLine());
                        a.desactivar(pin);
                        if (i==0){
                            System.out.println("ALARMA SONANDO!!");
                        }
                    }
                }
                break;
                case 3:{
                    a.consultarSensores();
                }
                break;
            }
        }while (opcion!=4);
    }
}
