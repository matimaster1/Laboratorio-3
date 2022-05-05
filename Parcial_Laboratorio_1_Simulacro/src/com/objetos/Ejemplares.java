package com.objetos;

public class Ejemplares {
    private double codigo;
    private String titulo;
    private int año_de_publicacion;

    public Ejemplares(double codigo, String titulo, int año_de_publicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año_de_publicacion = año_de_publicacion;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño_de_publicacion() {
        return año_de_publicacion;
    }

    public void setAño_de_publicacion(int año_de_publicacion) {
        this.año_de_publicacion = año_de_publicacion;
    }

    @Override
    public String toString() {
        return "Ejemplares{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", año_de_publicacion=" + año_de_publicacion +
                '}';
    }
}
