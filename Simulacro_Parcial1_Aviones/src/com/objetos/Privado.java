package com.objetos;

import java.util.ArrayList;

public class Privado extends Avion{

    private boolean jacuzzi;
    private String clavewifi;
    private boolean VerelMundial;
    private ArrayList<String> servicio=new ArrayList<>();

    public Privado(String modelo, String marca, String tipoDeMotor, int asientos, boolean jacuzzi, String clavewifi, boolean verelMundial) {
        super(modelo, marca, tipoDeMotor, asientos);
        this.jacuzzi = jacuzzi;
        this.clavewifi = clavewifi;
        VerelMundial = verelMundial;
        this.servicio.add("Servir Comida");
        this.servicio.add("Mantas para el Frio");
    }

    @Override
    public String toString() {
        return "Privado{" +" Estado="+this.getEstado()+
                " jacuzzi=" + jacuzzi +
                ", clavewifi='" + clavewifi + '\'' +
                ", VerelMundial=" + VerelMundial +
                ", servicio=" + servicio +
                '}';
    }
}


//Solo en los privados se puede ver el mundial (verdadero/falso)