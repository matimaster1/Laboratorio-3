package com.objetos;

public class acustica extends Cuerada{

    private String tipo_de_madera;

    public acustica(String marca, double precio, String tipo_de_madera) {
        super(marca, precio);
        this.tipo_de_madera = tipo_de_madera;
        this.cuerdas=6;
    }

    @Override
    public String toString() {
        return "Guitarra Acustica{" +
                "cuerdas=" + cuerdas + " marca="+this.getMarca()+" Precio="+this.getPrecio()+
                '}';
    }
}
