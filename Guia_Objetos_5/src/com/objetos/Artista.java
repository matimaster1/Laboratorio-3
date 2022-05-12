package com.objetos;

public class Artista {
    private String nombre;
    private int edad;
    private String nacionalidad;

    public Artista(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
