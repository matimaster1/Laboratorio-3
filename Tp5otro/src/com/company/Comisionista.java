package com.company;

public class Comisionista extends Empleado{
    private int cantidadEntregas;

    public Comisionista(int cantidadEntregas, double salario) {
        this.cantidadEntregas = cantidadEntregas;
        this.setSalarioBase(salario);
    }

    public int getCantidadEntregas() {
        return cantidadEntregas;
    }

    public void setCantidadEntregas(int cantidadEntregas) {
        this.cantidadEntregas = cantidadEntregas;
    }

    @Override
    public String toString() {
        return "\nComisionista{" +
                "cantidadEntregas=" + cantidadEntregas +"Salario"+ this.getSalarioBase()+
                '}';
    }
}
