package com.objetos3;

import com.objetos3.ejercicio1.Cilindro;
import com.objetos3.ejercicio2.Estudiante;
import com.objetos3.ejercicio2.Persona;
import com.objetos3.ejercicio2.Staff;
import com.objetos3.ejercicio3.Circulo;
import com.objetos3.ejercicio3.Cuadrado;
import com.objetos3.ejercicio3.Figuras;
import com.objetos3.ejercicio3.Rectangulo;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	/*ejercicio1

        Cilindro cilindro=new Cilindro();
        System.out.println(cilindro);

        Cilindro cilindro2=new Cilindro(30, 20);
        System.out.println(cilindro2);

        Cilindro cilindro3=new Cilindro();
        System.out.println(cilindro3);*/
    /*ejercicio2

        Estudiante estudiante1=new Estudiante("43387498", "matias", "torres", "matiastorres@gmail.com", "chingolo 200", 2001, 8000, "Programacion" );
        Estudiante estudiante2=new Estudiante("43387498", "matias", "torres", "matiastorres@gmail.com", "chingolo 200", 2001, 8000, "Programacion" );
        Estudiante estudiante3=new Estudiante("43387498", "matias", "torres", "matiastorres@gmail.com", "chingolo 200", 2001, 8000, "Programacion" );
        Estudiante estudiante4=new Estudiante("43387498", "matias", "torres", "matiastorres@gmail.com", "chingolo 200", 2001, 8000, "Programacion" );

        Staff staff1=new Staff("43387498", "matias", "torres", "matiastorres@gmail.com", "chingolo 200", 20000, "mañana");
        Staff staff2=new Staff("43387498", "matias", "torres", "matiastorres@gmail.com", "chingolo 200", 20000, "mañana");
        Staff staff3=new Staff("43387498", "matias", "torres", "matiastorres@gmail.com", "chingolo 200", 20000, "mañana");
        Staff staff4=new Staff("43387498", "matias", "torres", "matiastorres@gmail.com", "chingolo 200", 20000, "mañana");

        Persona[] personas=new Persona[8];

        personas[0]=estudiante1;
        personas[1]=estudiante2;
        personas[2]=estudiante3;
        personas[3]=estudiante4;
        personas[4]=staff1;
        personas[5]=staff2;
        personas[6]=staff3;
        personas[7]=staff4;

        int i=0, j=0;
        for (Persona e : personas){
            if (e instanceof Estudiante){
                i++;
            }
            if (e instanceof Staff){
                j++;
            }
        }

        System.out.println("Hay "+i+" Estudiantes y "+j+" Staffs");

        double sumadeingresos=0;

        for (Persona e : personas){
            if (e instanceof Estudiante){
                sumadeingresos+=((Estudiante) e).getCuotamensual();
            }
        }

        System.out.println("Ingresos de la institucon:"+sumadeingresos);*/
        /*ejercicio3*/
        Circulo circulo=new Circulo(12,"rojo");
        Rectangulo rectangulo=new Rectangulo();
        Cuadrado cuadrado=new Cuadrado(2,"verde");

        System.out.println(circulo);
        System.out.println(rectangulo);
        System.out.println(cuadrado);

        Figuras[] figuras={circulo, rectangulo, cuadrado};

        System.out.println("\n\n");
        for (Figuras e : figuras){
            System.out.println("Perimetro de la figura:"+e.getClass().getSimpleName()+" es igual a "+e.CalcularPerimetro());
            System.out.println("Area de la figura:"+e.getClass().getSimpleName()+" es igual a "+e.CalcularArea()+"\n");
        }

    }
}
