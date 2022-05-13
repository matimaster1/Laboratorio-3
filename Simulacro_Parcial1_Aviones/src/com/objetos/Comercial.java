package com.objetos;

import java.util.ArrayList;

public class Comercial extends Avion{
    private int Azafatas;
    private ArrayList<String> servicio=new ArrayList<>();

    public Comercial(String modelo, String marca, String tipoDeMotor, int asientos, int azafatas) {
        super(modelo, marca, tipoDeMotor, asientos);
        Azafatas = azafatas;
        this.servicio.add("Servir Comida");
        this.servicio.add("Mantas para el Frio");
    }

    @Override
    public String toString() {
        return "Comercial{" +" Estado="+this.getEstado()+
                " Azafatas=" + Azafatas +
                ", servicio=" + servicio +
                '}';
    }
}
