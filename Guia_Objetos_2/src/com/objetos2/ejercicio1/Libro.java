package com.objetos2.ejercicio1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor[] autores;

    public Libro(String titulo, double precio, int stock, Autor[] autores){
        this.autores=autores;
        this.precio=precio;
        this.stock=stock;
        this.titulo=titulo;
    }

    public String getGeneral(){
        return "\nTitulo: "+this.titulo+"\nPrecio: "+this.precio+"\nStock: "+stock+"\nAutor: \n"+this.autores[0].getNombre()+" "+this.autores[0].getApellido();
    }
    public void setPrecio(double precionuevo){
        this.precio=precionuevo;
    }
    public void  setSumarStock(int stockmod){
        this.stock=this.stock+stockmod;
    }
    public String getAutor(){
        return "\nAutor: \n"+this.autores[0].getGeneral();
    }
    public String getGeneralpublico(){
        return "El libro "+this.titulo+" de "+this.autores[0].getNombre()+" "+this.autores[0].getApellido()+" se vende a "+this.precio;
    }

    public String getGeneralpublicomasdeuno(){

        StringBuilder autoress=new StringBuilder();
        for (Autor n : this.autores){
            if (n!=null){
                autoress.append("/");
                autoress.append(n.getNombre()+" ");
                autoress.append(n.getApellido());
                autoress.append("/");
            }
        }
        return "El libro "+this.titulo+" de "+autoress+" se vende a "+this.precio;
    }

}
