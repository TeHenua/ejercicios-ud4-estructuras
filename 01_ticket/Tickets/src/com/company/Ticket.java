package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TeHenua on 06/02/2017.
 */
public class Ticket {
    private float total;
    private List<Linea> lineas;
    

    public Ticket() {
        lineas = new ArrayList<>();
    }

    public float calcularTotal(){
        for (Linea l: lineas) {
            total += (l.getPrecio() * l.getUnidades());
        }
        return total;
    }
    
    public void addLinea(Linea l){
        lineas.add(l);
        l.addTicket(this);
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<Linea> getLineas() {
        return lineas;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "total=" + total +
                '}';
    }
}
