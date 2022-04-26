package com.objetos4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//va a manejar las consultas y comparaciones
public class Videoclub {
    private Pelicula[] films;
    private Cliente[] clientes;
    private Factura[] factura;

    public Videoclub(Pelicula[] films, Cliente[] clientes) {
        this.films = films;
        this.clientes = clientes;
        this.factura = new Factura[50];
    }

    public Pelicula Buscarpelicula(String titulobuscado){
        for ( Pelicula e : this.films){
            if (e!=null){
                if (e.getTitulo().equalsIgnoreCase(titulobuscado)){
                    if (e.getStock()>=1){
                        return e;
                    }
                }
            }
        }
        return null;
    }

    public Pelicula BuscarpeliculaInfo(String titulobuscado){
        for ( Pelicula e : this.films){
            if (e!=null){
                if (e.getTitulo().equalsIgnoreCase(titulobuscado)){
                        return e;
                }
            }
        }
        return null;
    }


    private Cliente Busquedacliente(String nombre, Pelicula pelicula){
        int i=0;
        while (this.clientes[i]!=null){
            if (this.clientes[i].getNombre().equalsIgnoreCase(nombre)){
                this.clientes[i].Agregarpelicula(pelicula);
                return this.clientes[i];
            }
            else{
                i++;
            }
        }
        return null;
    }

    public String Alquiler(String nombre, String tiulo){
        Pelicula peliaux; Cliente clientaux; Factura factaux;
        peliaux=Buscarpelicula(tiulo);
        if (peliaux!=null){
            peliaux.setStock(peliaux.getStock()-1);
            peliaux.setVecesalquilada(peliaux.getVecesalquilada()+1);
            clientaux=Busquedacliente(nombre, peliaux);
            if (clientaux!=null){
                factaux=Generarfactura(peliaux, clientaux);
                return factaux.toString();
            }
            else {
                clientaux=Agregarnuevocliente(nombre, peliaux);
                factaux=Generarfactura(peliaux, clientaux);
                return factaux.toString();
            }
        }
        return "No se encuentra el titulo disponible";
    }

    public Cliente Crearnuevocliente(String numero){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        String nom=scan.next();
        String num=numero;
        System.out.println("Ingrese direccion:");
        String dir=scan.next();

        Cliente client=new Cliente(nom,num, dir);
        return client;
    }

    public Cliente Agregarnuevocliente(String nombre, Pelicula pelicula){
        Cliente addclient=Crearnuevocliente(nombre);
        int i=0;
        while (this.clientes[i]!=null){
            i++;
        }
        this.clientes[i]=addclient;
        this.clientes[i].Agregarpelicula(pelicula);
        return this.clientes[i];
    }

    public Factura Generarfactura(Pelicula pelicula, Cliente cliente){
        Factura factura=new Factura(pelicula, cliente, LocalDate.now());
        int i=0;
        while (this.factura[i]!=null){
            i++;
        }
        this.factura[i]=factura;
        return this.factura[i];
    }

    public void ConsultarClientes(){
        for (Cliente e : this.clientes)
        {
            if (e!=null){
                System.out.println(e.toString());
            }
        }
    }

    public void ConsultarAlquileresVigentes(){
        int i=0;
        while (this.factura[i]!=null){
            if (this.factura[i].getDevolucion().isBefore(LocalDate.of(2022, 4, 30))){
                System.out.println(this.factura[i].toString());
            }
            i++;
        }
    }

    public void ConsultarAlquileresDevolucion(){
        int i=0;
        while (this.factura[i]!=null){
            if (this.factura[i].getDevolucion().equals(LocalDate.now())){
                System.out.println(this.factura[i].toString());
            }
            i++;
        }
    }

    public void DevolverFilm(int idfatcura){
        Pelicula pelicula;
        for (int e=0; e<this.factura.length; e++){
            if (this.factura[e]!=null && idfatcura==this.factura[e].getId()){
                pelicula=this.factura[e].getPelicula();
                pelicula.setStock(pelicula.getStock()+1);
                pelicula.setVecesalquilada(pelicula.getVecesalquilada()-1);
                this.factura[e]=null;
                for (int i=e; i<this.factura.length; i++){
                    if (this.factura[i+1]!=null){
                        Factura aux=this.factura[i+1];
                        this.factura[i+1]=null;
                        this.factura[i]=aux;
                    }
                    else {
                        break;
                    }
                }
                break;
            }
        }
    }


    public void OrdenarStringsdePelicula(){
        for (int l=0; l< this.films.length; l++){
            for (int j=0; j< this.films.length-l-1; j++){
                if (this.films[j+1]!=null){
                    if (this.films[j].getVecesalquilada()<this.films[j+1].getVecesalquilada()){
                        Pelicula temp=this.films[j+1];

                        this.films[j+1]=this.films[j];
                        this.films[j]=temp;
                    }
                }
            }
        }
    }

    public String[] Ordenacionpormasalquiladas(){
        OrdenarStringsdePelicula();
        String[] titulos=new String[ConsultacantidadeTitulos()];

        //pasasololostitulosalarreglo
        int i=0;
        while (this.films[i]!=null && this.films[i].getVecesalquilada()>0){
            titulos[i]=this.films[i].getTitulo();
            i++;
        }
        return titulos;
    }


    public String[] BuscarpeliculaGenero(String genero){
            OrdenarStringsdePelicula();
            String[] titulos=new String[ConsultacantidadeTitulos()];

            //pasasololostitulosalarreglosololosdelgenero
            int i=0; int j=0;
            while (this.films[i]!=null){
                if (this.films[i].getGenero().equalsIgnoreCase(genero)){
                    titulos[j]=this.films[i].getTitulo();
                    j++;
                }
                i++;
            }
            return titulos;
        }




    public int ConsultacantidadeTitulos(){
        int i=0;
        for (Pelicula e : this.films){
            if (e!=null){
                i++;
            }
        }
        return i;
    }

    /*public String[] ConsultamasPopulares()
    {
        int i = ConsultacantidadeTitulos();
        String[] titulos = new String[i];
        int[] popularidad = new int[i];
        for (int e=0; e<this.factura.length; e++) {
            for (int j = 0; j < i; j++) {
                if (titulos[j] == null) {
                    titulos[j] = this.films[e].getTitulo();
                    j = i;
                } else if (titulos[j].equalsIgnoreCase(this.factura[e].getPelicula().getTitulo())==true) {
                    j = i;
                }
            }
        }
        for (Factura e : this.factura) {
            for (int j = 0; j < i; j++) {
                if (titulos[j].equalsIgnoreCase(e.getPelicula().getTitulo())) {
                    popularidad[j]++;
                    j = i;
                }
            }
        }
        String[] ultimo = new String[i];
        int o = 0, pos = 0;
        for (int t = 0; t < titulos.length; t++) {
            for (int q = 0; q < popularidad.length; q++) {
                if (o < popularidad[q]) {
                    o = popularidad[q];
                    pos = q;
                }
            }
            ultimo[t] = titulos[pos];
            popularidad[pos] = 0;
        }
        return ultimo;
    }*/

}
/*● Quiere una forma de consultar los títulos que fueron más alquilados.
● También quiere poder buscar títulos por género y ordenarlos según popularidad.*/


