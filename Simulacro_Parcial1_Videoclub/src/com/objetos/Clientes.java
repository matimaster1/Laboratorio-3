package com.objetos;

public class Clientes {
    private String nombre;
    private int id;
    private static int idSiguiente;

    public Clientes(String nombre) {
        this.nombre = nombre;
        id=idSiguiente;
        idSiguiente++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }
}
