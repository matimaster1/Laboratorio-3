package com.company;

public class Empleado {
    private String Dni;
    private String Nombre;
    private String Apellido;
    private double Salario;

    public Empleado(){
        this.Dni="00000000";
        this.Salario=0;
        this.Nombre="0";
        this.Apellido="0";
    }

    public void setDni(String dni){
        this.Dni=dni;
    }
    public void setApellido(String Apellido){
        this.Apellido=Apellido;
    }
    public void setNombre(String nombre){
        this.Nombre=nombre;
    }
    public void setSalario(double salario){
        this.Salario=salario;
    }
    public String getDni(){
        return this.Dni;
    }
    public String getApellido(){
        return this.Apellido;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public double getSalario(){
        return this.Salario;
    }

    public double getSalrioanual(){
        double anual=12*this.Salario;
        return anual;
    }

    public void setSalarioaumento(double aumento){
        aumento=(aumento*this.Salario)/100;
        this.Salario=this.Salario+aumento;
    }

    public String getImprimirDatosgenerales(){
        return "Empleado: [dni= "+this.Dni+" ,nombre= "+this.Nombre+" "+this.Apellido+" ,salario= "+this.Salario+"]";
    }



}
