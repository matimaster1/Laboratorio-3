package com.objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Peliculas implements Acciones{
    private String titulo;
    private boolean entregado=false;
    private int duarcion=60;
    private String creador;
    private int id;
    private static int idSiguiente=0;
    private List<Clientes> clientes=new ArrayList<>();

    public Peliculas(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Peliculas(String titulo, int duarcion, String creador) {
        this.titulo = titulo;
        this.duarcion = duarcion;
        this.creador = creador;
    }

    public Peliculas() {
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuarcion() {
        return duarcion;
    }

    public void setDuarcion(int duarcion) {
        this.duarcion = duarcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public void entregar(Clientes cliente) {
        this.clientes.add(cliente);
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int metodoComparar(Object a) {
        if (a instanceof Peliculas) {
            if (this.duarcion > ((Peliculas) a).duarcion) {
                return 1;
            } else if (this.duarcion == ((Peliculas) a).duarcion) {
                return 0;
            } else {
                return -1;
            }
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "titulo='" + titulo + '\'' +
                ", entregado=" + entregado +
                ", duarcion=" + duarcion +
                ", creador='" + creador + " ID="+this.id+" Clientes:"+clientes.toString()+'\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peliculas peliculas = (Peliculas) o;
        return Objects.equals(titulo, peliculas.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
