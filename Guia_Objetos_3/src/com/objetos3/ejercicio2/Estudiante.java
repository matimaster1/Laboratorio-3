package com.objetos3.ejercicio2;

import java.util.Date;

public class Estudiante extends Persona {
    private int anodeingreso;
    private double cuotamensual;
    private String carrera;

    public Estudiante(String dni, String nombre, String apellido, String email, String direccion, int ingreso, double cuotamensual, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anodeingreso=ingreso;
        this.carrera=carrera;
        this.cuotamensual=cuotamensual;
    }

    public int getAnodeingreso(){return this.anodeingreso;}
    public double getCuotamensual(){return this.cuotamensual;}
    public String getCarrera(){return this.carrera;}

    public void setAnodeingreso(int ano){this.anodeingreso=ano;}
    public void setCuotamensual(double cuotamensual){this.cuotamensual=cuotamensual;}
    public void setCarrera(String carrera){this.carrera=carrera;}

    @Override
    public String toString() {
        return "Estudiante{" +
                "anodeingreso=" + anodeingreso +
                ", cuotamensual=" + cuotamensual +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
