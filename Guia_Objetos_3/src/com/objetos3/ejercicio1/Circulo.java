package com.objetos3.ejercicio1;

import java.security.SecureRandom;

public class Circulo {
    private double radio=1.0;
    private String color="rojo";

    public Circulo(double radio, String color){
        this.color=color;
        this.radio=radio;
    }

    public Circulo(double radio){
        this.radio=radio;
    }

    public Circulo(){};


    public double getArea(){
        double area=Math.pow(radio, 2)*Math.PI;
        return area;
    }

    public double getRadio(){
        return radio;
    }
    public String getColor(){return this.color;}

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color +
                ", area='" + getArea()+'\'' +
                '}';
    }

}
