package com.objetos3.ejercicio2;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;

    public Persona(String dni, String nombre, String apellido, String email, String direccion){
        this.direccion=direccion;
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
    }
    public Persona(){};

    public String getNombre(){return this.nombre;}
    public String getDni(){return this.dni;}
    public String getApellido(){return this.apellido;}
    public String getEmail(){return this.email;}
    public String getDireccion(){return this.direccion;}

    public void setDni(String dni){this.dni=dni;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setApellido(String apellido){this.apellido=apellido;}
    public void setEmail(String email){this.email=email;}
    public void setDireccion(String direccion){this.direccion=direccion;}

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
