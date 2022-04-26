package com.objetos3.ejercicio3;

public abstract class Figuras {
    private String color;

    public Figuras(String color) {
        this.color = color;
    }

    public Figuras(){this.color="Incoloro";}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double CalcularArea();
    public abstract double CalcularPerimetro();
}
