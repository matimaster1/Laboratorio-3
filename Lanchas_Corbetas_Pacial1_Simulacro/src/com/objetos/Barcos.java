package com.objetos;

public class Barcos {
    private String marca;
    private String modelo;
    private int capacidadDeCombustible;
    private int capacidadDeCarga;
    private String patente;
    private boolean pescando=false;

    public Barcos(String marca, String modelo, int capacidadDeCombustible, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadDeCombustible = capacidadDeCombustible;
        this.patente = patente;
    }

    public boolean isPescando() {
        return pescando;
    }

    public void setPescando(boolean pescando) {
        this.pescando = pescando;
    }

    public String getPatente() {
        return patente;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public String toString() {
        return "{" + getClass().getSimpleName() +
                "   marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadDeCombustible=" + capacidadDeCombustible +
                ", capacidadDeCarga=" + capacidadDeCarga +
                ", patente='" + patente + '\'' +
                ", pescando=" + pescando +
                "}\n";
    }
}
