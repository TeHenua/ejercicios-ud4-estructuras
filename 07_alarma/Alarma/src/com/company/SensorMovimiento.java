package com.company;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by TeHenua on 06/03/2017.
 */
public class SensorMovimiento {
    private int umbral;
    private Alarma alarma;

    public SensorMovimiento(int umbral) {
        this.umbral = umbral;
    }

    public boolean hayMovimiento(){
        int movimiento = ThreadLocalRandom.current().nextInt(1,100);
        if(movimiento>umbral){
            System.out.println("ALARMA SONANDO!!!");
            return true;
        }else {
            return false;
        }
    }

    public int getUmbral() {
        return umbral;
    }

    public void setUmbral(int umbral) {
        this.umbral = umbral;
    }

    public Alarma getAlarma() {
        return alarma;
    }

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }

    @Override
    public String toString() {
        return "SensorMovimiento{" +
                "umbral=" + umbral +
                '}';
    }
}
