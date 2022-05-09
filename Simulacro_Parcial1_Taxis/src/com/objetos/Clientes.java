package com.objetos;

public class Clientes {
    private String nombre;
    private String apellido;
    private int numerodetelefono;
    private String direccion;

    public Clientes(String nombre, String apellido, int numerodetelefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numerodetelefono = numerodetelefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumerodetelefono() {
        return numerodetelefono;
    }

    public void setNumerodetelefono(int numerodetelefono) {
        this.numerodetelefono = numerodetelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
