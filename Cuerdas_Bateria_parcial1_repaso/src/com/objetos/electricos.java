package com.objetos;

public class electricos extends Cuerada{

    private String nombre_del_modelo;

    public electricos(String marca, double precio, String nombre_del_modelo) {
        super(marca, precio);
        this.nombre_del_modelo = nombre_del_modelo;
    }

    @Override
    public String toString() {
        return "Instrumento de Cuerda Electrico{" +
                "marca="+this.getMarca()+" Precio="+this.getPrecio()+"Nombre del modelo="+this.nombre_del_modelo+
                '}';
    }

    public String getNombre_del_modelo() {
        return nombre_del_modelo;
    }
}
