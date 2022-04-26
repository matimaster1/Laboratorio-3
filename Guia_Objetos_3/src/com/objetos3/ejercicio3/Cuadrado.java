package com.objetos3.ejercicio3;

public class Cuadrado extends Rectangulo{

    public Cuadrado(){
        super(1,1);
    }
    public Cuadrado(double lado, String color){
        super(lado,lado,color);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "alto=" + super.getAlto() +
                ", ancho=" + super.getAncho() +
                " color="+super.getColor()+'}';
    }
}
