package com.objetos;

import java.util.LinkedList;
import java.util.Scanner;

public class ListaPremium extends PlayList implements Reproduccion{
    private LinkedList<Cancion> milista;

    public ListaPremium(String nombre, LinkedList<Cancion> milista) {
        super(nombre);
        this.milista = milista;
    }

    @Override
    public void Reproduccion() {
        VermiLista();
        Scanner scan=new Scanner(System.in);
        String cancionelegid=scan.next();
        for (int i=0; i<milista.size(); i++){
            if (milista.get(i).getNombre().equalsIgnoreCase(cancionelegid)){
                System.out.println(milista.get(i));
            }
        }
    }

    @Override
    public void AnadirCancion(Cancion cancion) {
        milista.add(cancion);
    }

    @Override
    public void EliminarCancion(String cancion) {
        for (int i=0; i<milista.size(); i++){
            if (milista.get(i).getNombre().equalsIgnoreCase(cancion)){
                milista.remove(i);
            }
        }
    }

    @Override
    public void VermiLista() {
        System.out.println(milista.toString());
    }
}
