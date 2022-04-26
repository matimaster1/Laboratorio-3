package com.objetos3.ejercicio1;

public class Cilindro extends Circulo {
    private double altura=1.0;

    public Cilindro(double altura, double radio){
        super(radio);
        this.altura=altura;
    }

    public Cilindro(){
        super();
    }

    public double  getVolumen(){
        double volumen=super.getArea()*altura;
        return volumen;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                " subclase de " + super.toString() +
                ", altura='" +this.altura+ '\'' +
                '}';
    }

    @Override
    public double getArea() {
        return 2*Math.PI*getRadio()*altura+(2*super.getArea());
    }
}
