package com.objetos3.ejercicio3;

public class Rectangulo extends Figuras{
    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho, String color) {
        super(color);
        this.alto = alto;
        this.ancho = ancho;
    }

    public Rectangulo() {
        this.ancho=1;
        this.alto=2;
    }

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }


    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double CalcularArea(){
        return this.alto*this.ancho;
    }

    public double CalcularPerimetro(){
        return (this.alto*2)+(this.ancho*2);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                " color="+super.getColor()+'}';
    }
}
