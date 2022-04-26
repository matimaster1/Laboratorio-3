package com.objetos2.ejercicio2;

import java.time.LocalDateTime;
import java.util.UUID;

public class Cliente {
    private static String id;
    private String nombre;
    private String email;
    private int descuento;

    public Cliente(String nombre, String email, int descuento){
        UUID id=UUID.randomUUID();
        this.id=id.toString();
        this.nombre=nombre;
        this.email=email;
        this.descuento=descuento;
    }

    public int getDescuento(){return this.descuento;}
    public String getGeneral(){return "Cliente[id="+this.id+", nombre="+this.nombre+", email="+this.email+", descuento="+this.descuento+"%]";}


}
