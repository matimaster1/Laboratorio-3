package com.objetos4;

import java.time.LocalDate;
import java.util.Date;

public class Factura {
    private LocalDate retiro;
    private LocalDate devolucion;
    private static int i=0;
    private Pelicula pelicula;
    private Cliente cliente;
    private int id;

    public Factura(Pelicula pelicula, Cliente cliente, LocalDate retiro) {
        this.pelicula = pelicula;
        this.cliente=cliente;
        this.retiro=retiro;
        this.devolucion=retiro.plusDays(3);
        this.id=i++;
    }

    public LocalDate getRetiro() {
        return retiro;
    }

    public void setRetiro(LocalDate retiro) {
        this.retiro = retiro;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(LocalDate devolucion) {
        this.devolucion = devolucion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }



    @Override
    public String toString() {
        return "Factura{" +
                "retiro=" + retiro +
                ", devolucion=" + devolucion +
                ", pelicula=" + pelicula.getTitulo() +
                ", cliente=" + cliente.getNombre() +
                ", idfactura=" + this.id+'}';
    }
}
