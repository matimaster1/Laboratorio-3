package com.objetos;

public abstract class Cuerada extends Instrumentos{

    protected int cuerdas;

    public Cuerada(String marca, double precio) {
        super(marca, precio);
    }

    @Override
    public String toString() {
        return "Instrumento de Cuerda{" +
                "marca="+this.getMarca()+" Precio="+this.getPrecio()+
                '}';
    }
}
