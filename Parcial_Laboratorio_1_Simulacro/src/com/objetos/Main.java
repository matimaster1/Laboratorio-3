package com.objetos;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Biblioteca biblioteca1=new Biblioteca();

        biblioteca1.CrearLibro("Harry Potter", 2001, Generos.CUENTO.toString());
        biblioteca1.CrearLibro("It", 2006, Generos.TERROR.toString());
        biblioteca1.CrearLibro("Gaturro", 2010, Generos.ANIMADA.toString());

        biblioteca1.CrearDiario("La nación", 2012);
        biblioteca1.CrearDiario("La Capital", 2016);
        biblioteca1.CrearDiario("Clarin", 2022);

        biblioteca1.CrearRevista("Billiken", 2022);
        biblioteca1.CrearRevista("Ford", 2021);
        biblioteca1.CrearRevista("Gente", 2003);

        System.out.println(biblioteca1.Listado_ejemplares_disponibles());

        biblioteca1.Alquilar_Libro(1);

        System.out.println(biblioteca1.Listado_ejemplares_disponibles());

        biblioteca1.Devolver_Libros(1);

        System.out.println(biblioteca1.Listado_ejemplares_disponibles());

        System.out.println(biblioteca1.Alquilar_Libro(2));
        System.out.println(biblioteca1.Alquilar_Libro(2));

        System.out.println(biblioteca1.Devolver_Revista(7));

        System.out.println(biblioteca1.Alquilar_Diario(4));
        System.out.println(biblioteca1.Alquilar_Diario(4));

        System.out.println("DISPONIBLES");
        System.out.println(biblioteca1.Listado_ejemplares_disponibles());
        System.out.println("NO DISPONIBLES");
        System.out.println(biblioteca1.Listado_ejemplares_no_disponibles());


    }
}
