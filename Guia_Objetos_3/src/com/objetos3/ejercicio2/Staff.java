package com.objetos3.ejercicio2;

public class Staff extends Persona{
    private double salario;
    private String turno;

    public Staff(String dni, String nombre, String apellido, String email, String direccion, double salario, String turno){
        super(dni, nombre, apellido, email, direccion);
        this.turno=turno;
        this.salario=salario;
    }

    public double getSalario() {return salario;}
    public String getTurno() {return turno;}

    public void setSalario(double salario) {this.salario = salario;}
    public void setTurno(String turno) {this.turno = turno;}

    @Override
    public String toString(){
        return "Staff{ Salario: "+getSalario()+" Turno: "+getTurno()+" }";
    }

    public double SalarioAnual(){
        return this.salario*12;
    }
}
