package com.objetos;

public class Corbetas extends Barcos{
    private int jaulas;
    private final int capacidadDeJaulas=10;
    public static double totalRecaudado=0;
    private int capacidadTotal=capacidadDeCarga();

    public Corbetas(String marca, String modelo, int capacidadDeCombustible, String patente, int jaulas) {
        super(marca, modelo, capacidadDeCombustible, patente);
        super.setCapacidadDeCarga(this.capacidadTotal);
        this.jaulas = jaulas;
    }

    public int capacidadDeCarga(){
        return this.jaulas*this.capacidadDeJaulas;
    }

    public double recolectar(){
       double total=capacidadDeCarga()*Merluza.valorDeLaMerluza;
       totalRecaudado=totalRecaudado+total;
       return total;
    }

}
