package com.objetos;

public class Remises extends Vehiculos{
    public static double tarifaxcuadra;
    private int cantidaddecuadras;

    public Remises(String marca, String modelo, String combustible, String patente) {
        super(marca, modelo, combustible, patente);
    }

    public double getTarifaxcuadra() {
        return tarifaxcuadra;
    }

    public void setTarifaxcuadra(double tarifaxcuadra) {
        this.tarifaxcuadra = tarifaxcuadra;
    }

    public int getCantidaddecuadras() {
        return cantidaddecuadras;
    }

    public void setCantidaddecuadras(int cantidaddecuadras) {
        this.cantidaddecuadras = cantidaddecuadras;
    }

    public double CalcularPrecio(){
        double preciofinal=this.tarifaxcuadra*this.cantidaddecuadras;
        return preciofinal;
    }
}
