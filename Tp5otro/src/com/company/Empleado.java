package com.company;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Empleado{
    private String Legajo;
    private String Dni;
    private String Nombre;
    private String Apellido;
    private String email;
    private int Telefono;
    private LocalDate FechadeIngreso;
    private double SalarioBase;

    public Empleado(String legajo, String dni, String nombre, String apellido, String email, int telefono, LocalDate fechadeIngreso, double salarioBase) {
        Legajo = legajo;
        Dni = dni;
        Nombre = nombre;
        Apellido = apellido;
        this.email = email;
        Telefono = telefono;
        FechadeIngreso = fechadeIngreso;
        SalarioBase = salarioBase;
    }

    public Empleado() {
    }

    public String getLegajo() {
        return Legajo;
    }

    public void setLegajo(String legajo) {
        Legajo = legajo;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public LocalDate getFechadeIngreso() {
        return FechadeIngreso;
    }

    public void setFechadeIngreso(LocalDate fechadeIngreso) {
        FechadeIngreso = fechadeIngreso;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        SalarioBase = salarioBase;
    }

    public void calcularSalario(){

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Legajo='" + Legajo + '\'' +
                ", Dni='" + Dni + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", email='" + email + '\'' +
                ", Telefono=" + Telefono +
                ", FechadeIngreso=" + FechadeIngreso +
                ", SalarioBase=" + SalarioBase +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Telefono == empleado.Telefono && Double.compare(empleado.SalarioBase, SalarioBase) == 0 && Objects.equals(Legajo, empleado.Legajo) && Objects.equals(Dni, empleado.Dni) && Objects.equals(Nombre, empleado.Nombre) && Objects.equals(Apellido, empleado.Apellido) && Objects.equals(email, empleado.email) && Objects.equals(FechadeIngreso, empleado.FechadeIngreso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Legajo, Dni, Nombre, Apellido, email, Telefono, FechadeIngreso, SalarioBase);
    }
}
