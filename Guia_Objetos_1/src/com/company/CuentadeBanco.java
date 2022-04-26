package com.company;

public class CuentadeBanco {

    private int id;
    private String nombre;
    private double balance;

    public CuentadeBanco(){
        this.id=0;
        this.nombre="inexistente";
        this.balance=0;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
    public void setBalance(double bal){
        this.balance=bal;
    }
    public double getBalance(){
        return this.balance;
    }

    public String getDetalles(){
        return "Esta cuenta bancaria es de "+this.nombre+", numero de cuenta:"+this.id+" Balance:$"+this.balance;
    }

    public double getsetCredito(double credito){
        this.balance=this.balance+credito;
        return this.balance;
    }
    public double getsetDebito(double debito){
        this.balance=this.balance-debito;
        return this.balance;
    }
}
