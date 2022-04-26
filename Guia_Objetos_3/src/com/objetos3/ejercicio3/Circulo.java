package com.objetos3.ejercicio3;

public class Circulo extends Figuras{
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }


    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(){this.radio=1;}

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double CalcularArea(){
        return Math.pow(this.radio, 2)*Math.PI;
    }


    public double CalcularPerimetro(){
        return 2*Math.PI*this.radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                " color="+super.getColor()+'}';
    }
}
