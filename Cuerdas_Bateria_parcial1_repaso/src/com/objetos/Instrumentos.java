package com.objetos;

public class Instrumentos {
    private String marca;
    private double precio;



    public Instrumentos(String marca) {
        this.marca = marca;
    }

    public Instrumentos(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Instrumentos{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
