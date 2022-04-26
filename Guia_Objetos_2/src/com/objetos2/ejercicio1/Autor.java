package com.objetos2.ejercicio1;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor(String nombre, String apellido, String email, char genero){
        this.apellido=apellido;
        this.email=email;
        this.genero=genero;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public char getGenero() {
        return genero;
    }

    public String getGeneral(){
        return "Apellido: "+this.apellido+"\nNombre: "+this.nombre+"\nEmail: "+this.email+"\nGenero: "+genero;
    }
}
