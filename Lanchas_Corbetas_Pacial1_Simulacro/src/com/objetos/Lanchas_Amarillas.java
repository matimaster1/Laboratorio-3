package com.objetos;

public class Lanchas_Amarillas extends Barcos{
    private final int recoleccionPorHora=20;
    public static double totalRecaudado=0;

    public Lanchas_Amarillas(String marca, String modelo, int capacidadDeCombustible, String patente) {
        super(marca, modelo, capacidadDeCombustible, patente);
    }

    public int capacidadDeCarga(int horas){
        return this.recoleccionPorHora*horas;
    }

    public double recolectar(int horas){
        double total=capacidadDeCarga(horas)*Merluza.valorDeLaMerluza;
        totalRecaudado=totalRecaudado+total;
        return total;
    }

}
