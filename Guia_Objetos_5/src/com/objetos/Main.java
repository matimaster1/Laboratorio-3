package com.objetos;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cancion> canciones=new ArrayList<>();
        Artista PauloLondra=new Artista("Paulo Londra", 23, "Argentina");
        Artista bzrp=new Artista("BZRP", 22, "Argentina");
        Album LeonesconFlow=new Album(2022, PauloLondra, "Leones con Flow");
        Cancion chance=new Cancion("Chance", 5, Generos.POP.toString(), LeonesconFlow);
        Cancion plan_a=new Cancion("PlanA", 3, Generos.ROCK.toString(), LeonesconFlow);
        Cancion sesion23=new Cancion("Sesion23", 6, Generos.TRAP.toString(), LeonesconFlow, bzrp);
        canciones.add(chance);
        canciones.add(plan_a);
        canciones.add(sesion23);
        Stack<Cancion> ListaB=new Stack<>();
        LinkedList<Cancion> ListaP=new LinkedList<>();
        ListaB.push(canciones.get(1));
        ListaB.push(canciones.get(2));
        ListaP.add(canciones.get(1));
        ListaP.add(canciones.get(2));

        ListaBasica listaBasica=new ListaBasica("Paulo", ListaB);
        ListaPremium listaPremium=new ListaPremium("PauloPremium", ListaP);
        Menu(listaBasica, canciones);
        //Menu(listaPremium, canciones);


    }
    public static void Menu(PlayList play, ArrayList<Cancion> canciones){

        int opcion;
        String cerrarsesion="n";
        Scanner scan=new Scanner(System.in);
        while (cerrarsesion.equalsIgnoreCase("n")){
            System.out.println("Opcion 1: Reproducir Cancion de la PlayList");
            System.out.println("Opcion 2: Anadir Cancion a la PlayList");
            System.out.println("Opcion 3: Eliminar Cancion de la PlayList");
            System.out.println("Opcion 4: Mostrar canciones de la Play List");
            System.out.println("Cerrar Sesion");


            System.out.println("Ingrese una Opcion");
            opcion=scan.nextInt();
            switch (opcion){
                case 1:
                    if (play instanceof ListaPremium){
                       ((ListaPremium) play).Reproduccion();
                        System.out.println("Precion p para pasusar la cancion");
                        String pausa = scan.next();
                    }
                    else {
                        ((ListaBasica)play).Reproduccion();
                        System.out.println("Precion p para pasusar la cancion");
                        String pausa = scan.next();
                    }
                    break;
                case 2:
                    if (play instanceof ListaPremium){
                        ((ListaPremium) play).AnadirCancion(canciones.get(0));
                    }
                    else {
                        ((ListaBasica) play).AnadirCancion(canciones.get(0));
                    }
                    break;
                case 3:
                    if (play instanceof ListaPremium){
                        ((ListaPremium) play).VermiLista();
                        System.out.println("Elegi la cancion a ELIMINAR:");
                        String CANCION = scan.next();
                        ((ListaPremium) play).EliminarCancion(CANCION);
                    }
                    else {
                        ((ListaBasica)play).VermiLista();
                        System.out.println("Elegi la cancion a ELIMINAR:");
                        String CANCION = scan.next();
                        ((ListaBasica) play).EliminarCancion(CANCION);
                    }
                    break;
                case 4:
                    if (play instanceof ListaPremium){
                        ((ListaPremium) play).VermiLista();
                    }
                    else {
                        ((ListaBasica)play).VermiLista();
                    }
                    break;
                case 5:
                    cerrarsesion="s";
                    break;
                default:

                    break;
            }

        }
    }
}


/*
        Crear un menú para interactuar con nuestra lista de reproducción permitiéndonos
utilizar la funcionalidad de la interfaz (reproducir, añadir, eliminar, listar). Estando
en reproducción, debería apretar la letra “p” para pausar la canción y regresar al
menú principal.

 */