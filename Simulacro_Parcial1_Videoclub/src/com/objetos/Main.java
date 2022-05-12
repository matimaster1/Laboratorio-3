package com.objetos;

public class Main {

    public static void main(String[] args) {
        Videoclub videoclub1=new Videoclub();
        Clientes cliente1=new Clientes("Pedro");
        Clientes cliente2=new Clientes("Juana");
        Peliculas pelicula1=new Peliculas();
        Peliculas pelicula2=new Peliculas("Cars 3", "Dysney");
        Peliculas pelicula3=new Peliculas("Thor", 120, "Universal");
        Juegos_de_Consola juego1=new Juegos_de_Consola();
        Juegos_de_Consola juego2=new Juegos_de_Consola("Fortnite", 79);
        Juegos_de_Consola juego3=new Juegos_de_Consola("Lol", 90, "Moba", "Riot");

        videoclub1.agregarNuevoalCatalogo(pelicula2);
        videoclub1.agregarNuevoalCatalogo(pelicula3);
        videoclub1.agregarNuevoalCatalogo(juego2);
        videoclub1.agregarNuevoalCatalogo(juego3);

        System.out.println(videoclub1.Catalogo());

        (videoclub1.buscarPelicula(0)).entregar(cliente1);
        (videoclub1.buscarJuego(2)).entregar(cliente2);


        System.out.println("\n");
        System.out.println(videoclub1.Catalogo());
        System.out.println("\n");
        System.out.println(videoclub1.eliminaElemento(0));
        System.out.println(videoclub1.eliminaElemento(1));
        System.out.println("\n");
        System.out.println(videoclub1.Catalogo());
        System.out.println("\n");
        System.out.println(videoclub1.stockEntregado().toString());
        System.out.println("\n");
        System.out.println(videoclub1.PeliculayJuegoconmasHoras());




    }
}
