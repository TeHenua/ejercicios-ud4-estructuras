package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by TeHenua on 06/03/2017.
 */
public class Alarma {
    private int pin;
    private boolean activada;
    private int telefonoAviso;
    private Random rd = new Random();

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private List<SensorMovimiento> sensores = new ArrayList<>();

    public Alarma() {
        pin = rd.nextInt(10000);
        int numSensores = rd.nextInt(5)+1;
        for (int i = 0; i < numSensores; i++) {
            int umbral = rd.nextInt(100)+1;
            addSensores(new SensorMovimiento(umbral));
        }
    }

    public void addSensores(SensorMovimiento sensor){
        sensores.add(sensor);
        sensor.setAlarma(this);
    }

    public void consultarSensores(){
        for (int i = 0; i < sensores.size(); i++) {
            if(sensores.get(i).hayMovimiento()){
                System.out.println("Se ha localizado movimiento en el sensor "+(i+1)+" Llamando al" +
                        " teléfono "+telefonoAviso);
            }
        }

    }

    public void activar(){
        activada = true;
        System.out.println("ALARMA ACTIVADA!!");
    }

    public void desactivar(int pin) throws IOException {
            if(this.pin==pin){
                activada = false;
                System.out.println();
            }else{
                System.out.println("PIN incorrecto");
            }
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    public int getTelefonoAviso() {
        return telefonoAviso;
    }

    public void setTelefonoAviso(int telefonoAviso) {
        this.telefonoAviso = telefonoAviso;
    }

    @Override
    public String toString() {
        return "Alarma{" +
                "pin=" + pin +
                ", activada=" + activada +
                ", telefonoAviso=" + telefonoAviso +
                '}';
    }
}
