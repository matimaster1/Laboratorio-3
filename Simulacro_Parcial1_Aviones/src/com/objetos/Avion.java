package com.objetos;

public class Avion {
    private String modelo;
    private String marca;
    private String tipoDeMotor;
    private int asientos;
    private String estado="nuevo";//despegan, aterrizan y vuelan

    public Avion(String modelo, String marca, String tipoDeMotor, int asientos) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipoDeMotor = tipoDeMotor;
        this.asientos = asientos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

