package com.objetos;

import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        Barcos barcos = (Barcos) o;
        return capacidadDeCombustible == barcos.capacidadDeCombustible && capacidadDeCarga == barcos.capacidadDeCarga && pescando == barcos.pescando && Objects.equals(marca, barcos.marca) && Objects.equals(modelo, barcos.modelo) && Objects.equals(patente, barcos.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, capacidadDeCombustible, capacidadDeCarga, patente, pescando);
    }

}
