package com.objetos;

public class Militar extends Avion implements MetododeIngreso{
    private int cantidadDeBalas;
    private String tipodearmas;

    public Militar(String modelo, String marca, String tipoDeMotor, int asientos, int cantidadDeBalas, String tipodearmas) {
        super(modelo, marca, tipoDeMotor, asientos);
        this.cantidadDeBalas = cantidadDeBalas;
        this.tipodearmas = tipodearmas;
    }

    @Override
    public boolean Ingresar() {
        return false;
    }

    @Override
    public String toString() {
        return "Militar{" +" Estado="+this.getEstado()+
                " cantidadDeBalas=" + cantidadDeBalas +
                ", tipodearmas='" + tipodearmas + '\'' +
                '}';
    }
}