package com.objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListaBasica extends PlayList implements Reproduccion{
    private Stack<Cancion> milista=new Stack<>();

    public ListaBasica( String nombre, Stack<Cancion> lista) {
        super(nombre);
        this.milista=lista;
    }

    @Override
    public void Reproduccion() {
        Stack<Cancion> milistaaux=new Stack<>();
        System.out.println(milista.peek());


        Cancion cancionaux=milista.pop();

        while (milista.empty()==false){
            milistaaux.push(milista.pop());
        }
        milista.push(cancionaux);
        while (milistaaux.empty()==false){
            milista.push(milistaaux.pop());
        }


    }

    @Override
    public void AnadirCancion(Cancion cancion) {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void EliminarCancion(String cancion) {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void VermiLista() {
        System.out.println(milista.toString());
    }
}
