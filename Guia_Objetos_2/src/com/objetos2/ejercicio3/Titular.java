package com.objetos2.ejercicio3;

import java.util.UUID;

public class Titular {
    private UUID idcliente;
    private String nombre;
    private char genero2;

    public Titular(String nombre, char genero){
        this.idcliente=UUID.randomUUID();
        this.nombre=nombre;
        this.genero2=genero;
    }
    public String getNombre(){return this.nombre;}
    public String getGeneral(){return "Titular de la cuenta: "+this.nombre+"\nGenero:"+this.genero2+"\nNumero de cliente:"+idcliente.toString();}
}
