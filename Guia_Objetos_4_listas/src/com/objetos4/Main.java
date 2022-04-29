package com.objetos4;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Cliente> clientes=new ArrayList<Cliente>();
        List<Pelicula> peliculas=new ArrayList<Pelicula>();
        boolean salir=false;
        int i=0;
        Scanner scanner=new Scanner(System.in);
        clientes.add(new Cliente("matias", "22355666", "chingolo 454"));
        clientes.add(new Cliente("matias2", "22355667", "chingolo 454"));
        clientes.add(new Cliente("matias3", "22355669", "chingolo 454"));

        peliculas.add(new Pelicula("madagascar", Generos.AV, LocalDate.of(2010, 9, 5), 120, Clasificacion.G, "EEUU", "Pelicula animada sobre animales en busca de aventura", 3));
        peliculas.add(new Pelicula("chuky", Generos.H, LocalDate.of(2001, 12, 15), 160, Clasificacion.NC17, "EEUU", "Pelicula SOBRE UN MUÑECO ASESINO", 3));
        peliculas.add(new Pelicula("busqueda implacable", Generos.AC, LocalDate.of(2006, 10, 23), 100, Clasificacion.PG, "EEUU", "Secuestran a su hija y los mata a todos", 1));
        peliculas.add(new Pelicula("madagascar 2", Generos.AV, LocalDate.of(2012, 9, 5), 120, Clasificacion.G, "EEUU", "Pelicula animada sobre animales en busca de aventura", 3));

        Videoclub videoclubopen=new Videoclub(peliculas, clientes);

        videoclubopen.Alquiler("matias", "madagascar 2");
        videoclubopen.Alquiler("matias2", "chuky");
        videoclubopen.Alquiler("matias3", "chuky");
        videoclubopen.Alquiler("matias", "chuky");

        while (!salir){

            System.out.println("Opcion 1: Consultar Clientes");
            System.out.println("Opcion 2: Generar nuevo Alquiler");
            System.out.println("Opcion 3: Consultar Alquileres Vigentes");
            System.out.println("Opcion 4: Alquileres por Devolver Hoy");
            System.out.println("Opcion 5: Busqueda de Info de una Pelicula");
            System.out.println("Opcion 6: Busqueda por Genero");
            System.out.println("Opcion 7: Lo mas Alquilado");
            System.out.println("Opcion 8: Devolver una Pelicula");
            System.out.println("Opcion 9: Salir");
            System.out.printf("Ingrese una Opción: ");
            i=scanner.nextInt();

            switch (i){
                case 1:
                    videoclubopen.ConsultarClientes();
                    break;
                case 2:
                    System.out.println("\nGENERANDO ALQUILERES");

                    String nombre;
                    String peli;
                    int opcionpeli;
                    System.out.println("Ingrese la pelicula a Alquilar: ");
                    for (int j=0; j<peliculas.size(); j++){
                        System.out.println("Opcion "+j+" "+peliculas.get(j).getTitulo());
                    }
                    opcionpeli=scanner.nextInt();
                    peli=peliculas.get(opcionpeli).getTitulo();
                    System.out.println("Ingrese Nombre de Cliente: ");
                    nombre=scanner.next();

                    System.out.println(videoclubopen.Alquiler(nombre, peli));

                    break;
                case 3:
                    System.out.println("\nALQUILERES VIGENTES");
                    videoclubopen.ConsultarAlquileresVigentes();
                    break;
                case 4:
                    System.out.println("\nALQUILERES POR DEVOLVER HOY");
                    videoclubopen.ConsultarAlquileresDevolucion();
                    break;
                case 5:
                    System.out.println("\nBUSQUEDA INFO POR TITULO");

                    int opcionpeli2;
                    String peli2;
                    System.out.println("Ingrese la pelicula a Buscar: ");
                    for (int j=0; j<peliculas.size(); j++){
                        System.out.println("Opcion "+j+" "+peliculas.get(j).getTitulo());
                    }
                    opcionpeli2=scanner.nextInt();
                    peli2=peliculas.get(opcionpeli2).getTitulo();
                    System.out.println(videoclubopen.BuscarpeliculaInfo(peli2));
                    break;
                case 6:
                    String generoabuscar;
                    System.out.println("\nGENEROS: ");
                    System.out.println(Generos.AV);
                    System.out.println(Generos.AC);
                    System.out.println(Generos.H);
                    System.out.println(Generos.C);
                    System.out.println(Generos.DO);
                    System.out.println(Generos.DR);
                    System.out.println("Ingrese el Genero a Buscar: ");
                    generoabuscar=scanner.next();
                    String[] peliculasdelgeneroelegido=videoclubopen.BuscarpeliculaGenero(generoabuscar);
                    for (String e: peliculasdelgeneroelegido){
                        if (e!=null){
                            System.out.println(e);
                        }
                    }

                    break;
                case 7:
                    System.out.println("LOS MAS ALQUILADOS");
                    String[] peliculastop=videoclubopen.Ordenacionpormasalquiladas();
                    for (String e: peliculastop){
                        if (e!=null){
                            System.out.println(e);
                        }
                    }

                    break;
                case 8:
                    System.out.println("\nDevolucion de pelicula");
                    int iddelafactura;
                    videoclubopen.ConsultarAlquileresVigentes();
                    System.out.println("Ingrese el Id de la Factura para la Devolucion de la Pelicula: ");
                    iddelafactura=scanner.nextInt();
                    videoclubopen.DevolverFilm(iddelafactura);
                    break;
                case 9:
                    System.out.println("Saliendo......");
                    salir=true;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }



    }
}



