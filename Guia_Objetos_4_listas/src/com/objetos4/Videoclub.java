package com.objetos4;

import java.time.LocalDate;
import java.util.*;

//va a manejar las consultas y comparaciones
public class Videoclub {
    private List<Pelicula> films;
    private List<Cliente> clientes;
    private List<Factura> factura;

    public Videoclub(List<Pelicula> films, List<Cliente> clientes) {
        this.films = films;
        this.clientes = clientes;
        this.factura = new ArrayList<Factura>();
    }

    public Pelicula Buscarpelicula(String titulobuscado){
        for ( Pelicula e : this.films){
            if (e.getTitulo().equalsIgnoreCase(titulobuscado)){
                if (e.getStock()>=1){
                    return e;
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
        while (this.clientes.get(i)!=null){
            if (this.clientes.get(i).getNombre().equalsIgnoreCase(nombre)){
                this.clientes.get(i).Agregarpelicula(pelicula);
                return this.clientes.get(i);
            }
            else{
                i++;
            }
        }
        return null;
    }

    public String Alquiler(String nombre, String tiulo){
        int i=this.films.indexOf(Buscarpelicula(tiulo));
        if (i!=-1){
            this.films.get(i).setStock(this.films.get(i).getStock()-1);
            this.films.get(i).setVecesalquilada(this.films.get(i).getVecesalquilada()+1);
            int j=this.clientes.indexOf(Busquedacliente(nombre, this.films.get(i)));
            if (j!=-1){
                this.factura.add(new Factura(this.films.get(i), this.clientes.get(j), LocalDate.now()));
                return this.factura.get(this.factura.size()-1).toString();
            }
            else {
                this.clientes.add(Crearnuevocliente(nombre, this.films.get(i)));
                this.factura.add(new Factura(this.films.get(i), this.clientes.get(this.clientes.size()-1), LocalDate.now()));
                return this.factura.get(this.factura.size()-1).toString();
            }
        }
        return "No se encuentra el titulo disponible";
    }

    public Cliente Crearnuevocliente(String nombre, Pelicula pelicula){
        Scanner scan=new Scanner(System.in);
        String nom=nombre;
        System.out.println("Debe crear un Nuevo usuario ya que no se Encuentra en la base de datos");
        System.out.println("Ingrese el numero de contacto:");
        String num=scan.next();
        System.out.println("Ingrese direccion:");
        String dir=scan.next();

        Cliente client=new Cliente(nom,num, dir);
        client.Agregarpelicula(pelicula);
        return client;
    }



    public void ConsultarClientes(){
        for (Cliente e : this.clientes)
        {
            System.out.println(e.toString());
        }
    }

    public void ConsultarAlquileresVigentes(){
        for (int i=0; i<this.factura.size(); i++) {
            if (this.factura.get(i).getDevolucion().isAfter(LocalDate.now())) {
                System.out.println(this.factura.get(i).toString());
            }
        }
    }

    public void ConsultarAlquileresDevolucion(){
        for (int i=0; i<this.factura.size(); i++) {
            if (this.factura.get(i).getDevolucion().equals(LocalDate.now())) {
                System.out.println(this.factura.get(i).toString());
            }
        }
    }

    public void DevolverFilm(int idfatcura){
        for (int e=0; e<this.factura.size(); e++){
            if (idfatcura==this.factura.get(e).getId()){
                this.films.get(e).setStock(this.films.get(e).getStock()+1);
                this.films.get(e).setVecesalquilada(this.films.get(e).getVecesalquilada()-1);
                this.factura.remove(e);
            }
        }
    }


    public String[] Ordenacionpormasalquiladas(){
        Collections.sort(this.films);

        //pasasololostitulosalarreglo
        int i=0;
        String[] titulos=new String[this.films.size()];
        while (this.films.get(i).getVecesalquilada()>0){
            titulos[i]= this.films.get(i).getTitulo();
            i++;
        }
        return titulos;
    }


    public String[] BuscarpeliculaGenero(String genero){
        Collections.sort(this.films);

        //pasasololostitulosalarreglo
        int i=0, f=0;
        String[] titulos=new String[this.films.size()];
        for (int j=0; j<this.films.size(); j++){
            if (this.films.get(j).getGenero().equalsIgnoreCase(genero)){
                titulos[f]= this.films.get(j).getTitulo();
                f++;
            }
        }
            return titulos;
        }

    //  uso la clase Collection y Comparator para ordenar por popularidad

    public List<Pelicula> getFilms() {
        return films;
    }

    public void setFilms(List<Pelicula> films) {
        this.films = films;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Factura> getFactura() {
        return factura;
    }

    public void setFactura(List<Factura> factura) {
        this.factura = factura;
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


