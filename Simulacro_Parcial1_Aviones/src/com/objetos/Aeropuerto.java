package com.objetos;

import java.util.ArrayList;

public class Aeropuerto {
    private String nombre;
    private String direccion;
    private int capacidadOperacionalMaxima;
    private int cantidadDeAviones;
    private int codigointernacional;
    private ArrayList<Avion> hangarComercial=new ArrayList<>();
    private ArrayList<Avion> hangarPrivado=new ArrayList<>();
    private ArrayList<Avion> hangarMilitar=new ArrayList<>();
    private ArrayList<Avion> hangarCarga=new ArrayList<>();

    public Aeropuerto(String nombre, String direccion, int capacidadOperacionalMaxima, int codigointernacional) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidadOperacionalMaxima = capacidadOperacionalMaxima;
        this.codigointernacional = codigointernacional;
    }

    public void HacerDespegarAngar(ArrayList<Avion> hangar){
        for (Avion a : hangar){
            a.setEstado("despegando");
        }
    }

    public void AgregarAvion(Avion agregar){

        if (cantidadDeAviones+1<=capacidadOperacionalMaxima) {
            if (agregar instanceof Comercial) {
                hangarComercial.add((Comercial) agregar);
            } else if (agregar instanceof Privado) {
                hangarPrivado.add((Privado) agregar);
            } else if (agregar instanceof Militar) {
                hangarMilitar.add((Militar) agregar);
            } else {
                hangarCarga.add((Carga) agregar);
            }
            cantidadDeAviones++;
        }
        else {
            System.out.println("Se excede la cantidad de capacidad Operacioanl");
        }
    }

    public ArrayList<Avion> getHangarComercial() {
        return hangarComercial;
    }

    public ArrayList<Avion> getHangarPrivado() {
        return hangarPrivado;
    }

    public ArrayList<Avion> getHangarMilitar() {
        return hangarMilitar;
    }

    public ArrayList<Avion> getHangarCarga() {
        return hangarCarga;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", capacidadOperacionalMaxima=" + capacidadOperacionalMaxima +
                ", cantidadDeAviones=" + cantidadDeAviones +
                ", codigointernacional=" + codigointernacional +
                "\n, hangarComercial=" + hangarComercial +
                "\n, hangarPrivado=" + hangarPrivado +
                "\n, hangarMilitar=" + hangarMilitar +
                "\n, hangarCarga=" + hangarCarga +
                '}';
    }
}
