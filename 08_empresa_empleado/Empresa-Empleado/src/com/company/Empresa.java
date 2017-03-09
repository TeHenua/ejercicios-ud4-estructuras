package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TeHenua on 06/03/2017.
 */
public class Empresa {
    private String nombre;
    private String añofundacion;

    private List<Empleado> empleados = new ArrayList<>();

    public Empresa(String nombre, String añofundacion) {
        this.nombre = nombre;
        this.añofundacion = añofundacion;
    }

    public void limpiarEmpleados(){
        empleados.clear();
    }

    public void addEmpleado(Empleado e){
        empleados.add(e);
        e.setEmpresa(this);
    }

    public void listarEmpleados(){
        for (Empleado e: empleados) {
            System.out.println(e);
            if (e.getClass().getCanonicalName().equalsIgnoreCase("com.company.Directivo")){
                Directivo d = (Directivo) e;
                System.out.println("Es un directivo, su bonus es: "+d.getBonusPersonal()+
                " su salario es: "+d.getSalarioAnual());
            }else{
                Operario o = (Operario) e;
                System.out.println("Es un operario, su salario/hora es: "+o.getSalarioHora()+ " sus horas son: "+
                o.getHorasContrato());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAñofundacion() {
        return añofundacion;
    }

    public void setAñofundacion(String añofundacion) {
        this.añofundacion = añofundacion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", añofundacion='" + añofundacion + '\'' +
                '}';
    }
}
