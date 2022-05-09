package com.objetos;

public class Libros extends Revistas{

    private String genero;

    public Libros(double codigo, String titulo, int año_de_publicacion,  String genero) {
        super(codigo, titulo, año_de_publicacion);
        this.genero=genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
