package com.objetos;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

public class Videoclub {
    private static int idCatalogo;
    private ArrayList<Peliculas> peliculasCatalogo=new ArrayList<>();
    private ArrayList<Juegos_de_Consola> juegosCatalogo=new ArrayList<>();

    public void agregarNuevoalCatalogo(Object nuevo){
        if (nuevo instanceof Juegos_de_Consola){
            ((Juegos_de_Consola) nuevo).setId(idCatalogo);
            idCatalogo++;
            juegosCatalogo.add((Juegos_de_Consola) nuevo);
        }
        else {
            ((Peliculas)nuevo).setId(idCatalogo);
            idCatalogo++;
            peliculasCatalogo.add((Peliculas) nuevo);
        }
    }

    public String eliminaElemento(int id){
        for (int i=0; i<peliculasCatalogo.size(); i++){
            if (peliculasCatalogo.get(i).getId()==id) {
                if (peliculasCatalogo.get(i).isEntregado()==false){
                    peliculasCatalogo.remove(i);
                    return "Eliminado con Exito";
                }
                else {
                    return "La pelicula esta entregada";
                }
            }
        }
        for (int i=0; i<juegosCatalogo.size(); i++){
            if (juegosCatalogo.get(i).getId()==id) {
                if (juegosCatalogo.get(i).isEntregado()==false){
                    juegosCatalogo.remove(i);
                    return "Eliminado con Exito";
                }
                else {
                    return "El juego esta entregada";
                }
            }
        }
        return "Pelicula no disponible";
    }

    public int stockSumarizar(){
        int stock=juegosCatalogo.size()+peliculasCatalogo.size();
        return stock;
    }

    public ArrayList<Object> stockEntregado(){

        ArrayList<Object> catalogo=new ArrayList<>();
        for (Peliculas e : peliculasCatalogo){
            if (e.isEntregado()==true){
                catalogo.add(e);
            }
        }
        for (Juegos_de_Consola e : juegosCatalogo){
            if (e.isEntregado()==true){
                catalogo.add(e);
            }
        }

        return catalogo;
    }

    public Juegos_de_Consola buscarJuego(int id){
        for (Juegos_de_Consola e : juegosCatalogo){
            if (e.getId()==id){
                return e;
            }
        }
        return null;
    }

    public Peliculas buscarPelicula(int id){
        for (Peliculas e : peliculasCatalogo){
            if (e.getId()==id){
                return e;
            }
        }
        return null;
    }

    public String Catalogo(){
        return juegosCatalogo.toString()+"\n"+peliculasCatalogo.toString();
    }

    public String PeliculayJuegoconmasHoras(){
        Peliculas pelicula=peliculasCatalogo.get(peliculasCatalogo.size()-1);
        Juegos_de_Consola juego=juegosCatalogo.get(juegosCatalogo.size()-1);
        for (Peliculas e : peliculasCatalogo){
            if (e.metodoComparar(pelicula)==1){
                pelicula=e;
            }
        }
        for (Juegos_de_Consola e : juegosCatalogo){
            if (e.metodoComparar(juego)==1){
                juego=e;
            }
        }
        return pelicula.toString()+"\n"+juego.toString();
    }

}
