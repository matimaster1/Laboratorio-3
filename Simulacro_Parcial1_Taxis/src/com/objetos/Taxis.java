package com.objetos;

public class Taxis extends Vehiculos{
    private double contador_de_kilometros;
    public static double bajada_de_bandera;
    public static double precioxkilometro;

    public Taxis(String marca, String modelo, String combustible, String patente) {
        super(marca, modelo, combustible, patente);
    }

    public double getContador_de_kilometros() {
        return contador_de_kilometros;
    }

    public void setContador_de_kilometros(double contador_de_kilometros) {
        this.contador_de_kilometros = contador_de_kilometros;
    }

    public double getBajada_de_bandera() {
        return bajada_de_bandera;
    }

    public void setBajada_de_bandera(double bajada_de_bandera) {
        this.bajada_de_bandera = bajada_de_bandera;
    }

    public double getPrecioxkilometro() {
        return precioxkilometro;
    }

    public void setPrecioxkilometro(double precioxkilometro) {
        this.precioxkilometro = precioxkilometro;
    }

    public double CalcularPrecio(){
        double preciofinal=this.bajada_de_bandera+this.precioxkilometro*this.contador_de_kilometros;
        return preciofinal;
    }


}
