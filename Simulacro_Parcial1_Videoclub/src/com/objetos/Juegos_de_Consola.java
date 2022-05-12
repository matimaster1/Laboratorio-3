package com.objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Juegos_de_Consola implements Acciones {
    private String titulo;
    private int horasEstimadas=10;
    private boolean entregado=false;
    private String genero;
    private String compania;
    private int id;
    private ArrayList<Clientes> clientes=new ArrayList<>();

    public Juegos_de_Consola(){};

    public Juegos_de_Consola(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Juegos_de_Consola(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
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

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
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
        if (a instanceof Juegos_de_Consola) {
            if (this.horasEstimadas > ((Juegos_de_Consola) a).horasEstimadas) {
                return 1;
            } else if (this.horasEstimadas == ((Juegos_de_Consola) a).horasEstimadas) {
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
        return "Juegos_de_Consola{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania +" ID="+ this.id+ " Clientes:"+clientes.toString()+'\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Juegos_de_Consola that = (Juegos_de_Consola) o;
        return Objects.equals(titulo, that.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
