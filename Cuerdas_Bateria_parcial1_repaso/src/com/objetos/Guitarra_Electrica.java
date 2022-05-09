package com.objetos;

public class Guitarra_Electrica extends electricos implements Sonido{

    public Guitarra_Electrica(String marca, double precio, String nombre_del_modelo) {
        super(marca, precio, nombre_del_modelo);
        this.cuerdas=6;
    }

    @Override
    public String SonidoAmplificado() {
        return this.getClass().getSimpleName()+":SONIDO AMPLIFICADO";
    }

    @Override
    public String toString() {
        return "Guitarra Electrica{" +
                "cuerdas=" + this.cuerdas + " marca="+this.getMarca()+" Precio="+this.getPrecio()+"  Nombre del modelo="+this.getNombre_del_modelo()+
                '}';
    }

}
