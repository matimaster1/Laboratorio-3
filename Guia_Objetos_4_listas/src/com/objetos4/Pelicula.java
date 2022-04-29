package com.objetos4;

import java.time.LocalDate;
import java.util.Date;

public class Pelicula implements Comparable<Pelicula> {
    private String titulo;
    private String genero;
    private LocalDate lanzamiento;
    private int duracionenminutos;
    private String clasificacion;
    private String paisdeorigen;
    private String descripcion;
    private int vecesalquilada;
    private int stock;

    public Pelicula(String titulo, String genero, LocalDate lanzamiento, int duracionenminutos, String clasificacion, String paisdeorigen, String descripcion, int stock) {
        this.titulo = titulo;
        this.genero = genero;
        this.lanzamiento = lanzamiento;
        this.duracionenminutos = duracionenminutos;
        this.clasificacion = clasificacion;
        this.paisdeorigen = paisdeorigen;
        this.descripcion = descripcion;
        this.stock = stock;
        this.vecesalquilada=0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(LocalDate lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getDuracionenminutos() {
        return duracionenminutos;
    }

    public void setDuracionenminutos(int duracionenminutos) {
        this.duracionenminutos = duracionenminutos;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getPaisdeorigen() {
        return paisdeorigen;
    }

    public void setPaisdeorigen(String paisdeorigen) {
        this.paisdeorigen = paisdeorigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getVecesalquilada() {
        return vecesalquilada;
    }

    public void setVecesalquilada(int vecesalquilada) {
        this.vecesalquilada = vecesalquilada;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", lanzamiento=" + lanzamiento +
                ", duracionenminutos=" + duracionenminutos +
                ", clasificacion='" + clasificacion + '\'' +
                ", paisdeorigen='" + paisdeorigen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                '}';
    }

    @Override
    public int compareTo(Pelicula o) {
        if (o.getVecesalquilada()>this.vecesalquilada){
            return 1;
        }
        else if (o.getVecesalquilada()==this.vecesalquilada){
            return 0;
        }
        else {
            return -1;
        }
    }
}
