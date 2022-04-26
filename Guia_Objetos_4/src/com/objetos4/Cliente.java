package com.objetos4;

import java.util.ArrayList;
import java.util.Arrays;

public class Cliente {
    private String nombre;
    private String telefono;
    private String direccion;
    private String[] peliculas=new String[10];

    public Cliente(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void Agregarpelicula(Pelicula peli){
        int i=0;
        while (this.peliculas[i]!=null){
            i++;
        }
        this.peliculas[i]=peli.getTitulo();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", peliculas=" + Arrays.toString(peliculas) +
                '}';
    }
}
