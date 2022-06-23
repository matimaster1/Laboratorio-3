package com.company;

import java.util.Objects;

public class Celular {
    private int id;
    private static int idsum=1;
    private  String modelo;
    private String marca;
    private String numero;


    public Celular(String modelo, String marca, String numero) {
        this.id=idsum;
        idsum++;
        this.modelo = modelo;
        this.marca = marca;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Celular celular = (Celular) o;
        return id == celular.id && numero == celular.numero && Objects.equals(modelo, celular.modelo) && Objects.equals(marca, celular.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelo, marca, numero);
    }
}
