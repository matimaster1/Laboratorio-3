package com.company;

public class Vendedor extends Empleado implements AcionesCelular{
    private  float porcentajeComision;
    private Celular celularasignado;

    public Vendedor(float porcentajeComision, Celular celularasignado, double salario) {
        this.porcentajeComision = porcentajeComision;
        this.celularasignado = celularasignado;
        this.setSalarioBase(salario);
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public Celular getCelularasignado() {
        return celularasignado;
    }

    public void setCelularasignado(Celular celularasignado) {
        this.celularasignado = celularasignado;
    }

    @Override
    public String toString() {
        return "\nVendedor{" +
                "porcentajeComision=" + porcentajeComision +
                ", celularasignado=" + celularasignado + "Salario"+ this.getSalarioBase()+
                '}';
    }

    public void llamar(){

    }

    public void atender(){

    }
}
