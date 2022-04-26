package com.objetos2.ejercicio3;

import java.util.UUID;

public class Cuenta {
    private UUID idcuenta;
    private Titular clientecuenta;
    private double balance;
    private String[] registros;
    private static int i;

    public Cuenta(Titular client, double bal){
        this.idcuenta=UUID.randomUUID();
        this.clientecuenta=client;
        this.balance=bal;
        this.registros=new String[10];
        this.i=0;
    }

    public void setBalanceDeposito(double deposito){
        this.balance+=deposito;
        if (i==10){
            i=0;
        }
        this.registros[i]="El cliente "+this.clientecuenta.getNombre()+", deposito "+deposito;
        this.i++;
    }

    public boolean setBalanceExtraccion(double extraccion){

        if (this.balance-extraccion>=-2000){
            this.balance-=extraccion;
            if (i==10){
                i=0;
            }
            this.registros[i]="El cliente "+this.clientecuenta.getNombre()+", retiro "+extraccion;
            this.i++;
            return true;
        }
        else {
            System.out.println("Fondos insuficientes y supera el saldo deudor de 2000 ");
            return false;
        }
    }

    public String getDatosdelacuenta(){return "Balance Total: "+this.balance+" iddelacuenta: "+this.idcuenta.toString()+" "+this.clientecuenta.getGeneral();}

    public String[] getRegistros(){
        return this.registros;
    }

}




