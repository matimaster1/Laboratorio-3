package com.company;

public class Rectangulo {
    private double ancho;
    private double alto;
    private double area;
    private double perimetro;

    public Rectangulo(){
        this.alto=1.0;
        this.ancho=1.0;
    }

    public void setAncho(double ancho){
        this.ancho=ancho;
    }
    public void setAlto(double alto){
        this.alto=alto;
    }
    public double getAncho(){
        return this.ancho;
    }
    public double getAlto(){
        return this.alto;
    }

    public double getsetArea(){
        this.area=this.alto*this.ancho;
        return this.area;
    }
    public double getsetPerimetro(){
        this.perimetro=2*this.alto+2*this.ancho;
        return this.perimetro;
    }



}
