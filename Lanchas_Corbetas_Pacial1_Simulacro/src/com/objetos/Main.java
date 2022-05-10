package com.objetos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Barcos> barcos=new ArrayList<>();
        Sistema_de_Pesca sistema_de_pesca=new Sistema_de_Pesca(barcos);
        Barcos barco1=new Lanchas_Amarillas("ford", "A57", 200, "AHJ567");
        Barcos barco2=new Lanchas_Amarillas("adidas", "NLO", 200, "GTR123");
        Barcos barco3=new Corbetas("ford", "A5r7", 200, "LIT456", 5);
        Barcos barco4=new Corbetas("sdfsd", "fgdf", 879, "JKL980", 10);

        sistema_de_pesca.AgregarBarco(barco1);
        sistema_de_pesca.AgregarBarco(barco2);
        sistema_de_pesca.AgregarBarco(barco3);
        sistema_de_pesca.AgregarBarco(barco4);

        System.out.println(sistema_de_pesca.mostrarListado());

        System.out.println(sistema_de_pesca.Recoleccion("LIT456", 0));
        System.out.println(sistema_de_pesca.Recoleccion("AHJ567", 4));
        System.out.println(sistema_de_pesca.Recoleccion("LIT456", 0));
        sistema_de_pesca.ListarBarco("LIT456");
        System.out.println(sistema_de_pesca.Recoleccion("LIT456", 0));

        System.out.println("Lanchas total="+Lanchas_Amarillas.totalRecaudado);
        System.out.println("Corbetas total="+Corbetas.totalRecaudado);
        System.out.println("TOTAL="+sistema_de_pesca.getTotalRecaudado());

    }
}
