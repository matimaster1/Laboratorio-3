package com.objetos;

public class Bajo extends electricos implements Sonido{


    public Bajo(String marca, double precio, String nombre_del_modelo) {
        super(marca, precio, nombre_del_modelo);
        this.cuerdas=4;
    }

    @Override
    public String SonidoAmplificado() {
        return this.getClass().getSimpleName()+":SONIDO AMPLIFICADO";
    }

    @Override
    public String toString() {
        return "Bajo Electrica{" +
                "cuerdas=" + cuerdas + " marca="+this.getMarca()+" Precio="+this.getPrecio()+" Nombre del modelo="+this.getNombre_del_modelo()+
                '}';
    }

}
