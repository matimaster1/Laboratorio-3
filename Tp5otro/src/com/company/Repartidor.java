package com.company;

public class Repartidor extends Empleado implements AcionesCelular{
    private int salidasPorDia;
    private Celular celularAsignado;

    public Repartidor(int salidasPorDia, Celular celularAsignado, double salario) {
        this.salidasPorDia = salidasPorDia;
        this.celularAsignado = celularAsignado;
        this.setSalarioBase(salario);
    }

    public int getSalidasPorDia() {
        return salidasPorDia;
    }

    public void setSalidasPorDia(int salidasPorDia) {
        this.salidasPorDia = salidasPorDia;
    }

    public Celular getCelularAsignado() {
        return celularAsignado;
    }

    public void setCelularAsignado(Celular celularAsignado) {
        this.celularAsignado = celularAsignado;
    }

    @Override
    public String toString() {
        return "\nRepartidor{" +
                "salidasPorDia=" + salidasPorDia +
                ", celularAsignado=" + celularAsignado +"Salario"+ this.getSalarioBase()+
                '}';
    }

    public void llamar(){

    }

    public void atender(){

    }

}
