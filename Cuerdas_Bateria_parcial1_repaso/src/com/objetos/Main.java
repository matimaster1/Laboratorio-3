package com.objetos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Instrumentos> instrumentos=new ArrayList<>();

        instrumentos.add(new Bateria("Yamaha", 5, 3));
        instrumentos.add(new Bateria("Bedson",6, 4));

        instrumentos.add(new Guitarra_Electrica("fender", 70000, "A57"));
        instrumentos.add(new Guitarra_Electrica("YULIAN", 80000, "A90"));

        instrumentos.add(new Bajo("huli", 75000, "Ak99"));
        instrumentos.add(new Bajo("olar", 99000, "p94"));

        instrumentos.add(new acustica("looping", 96543, "roble"));
        instrumentos.add(new acustica("cortno", 64588, "abedul"));

        for (Instrumentos e : instrumentos){
            if (e instanceof Bateria){
                System.out.println(e);
            }
            else if (e instanceof Bajo){
                System.out.println(e);
                System.out.println(((Bajo) e).SonidoAmplificado());
            }
            else if (e instanceof Guitarra_Electrica){
                System.out.println(e);
                System.out.println(((Guitarra_Electrica) e).SonidoAmplificado());
            }
            else if (e instanceof acustica){
                System.out.println(e);
            }
        }

        System.out.println("VALORES CON AUMENTO");
        Valores_con_aumento(instrumentos);
        System.out.println("VALORES SIN AUMENTO");
        Valores_sin_aumento(instrumentos);

    }

    public static void Valores_con_aumento(ArrayList<Instrumentos> instrumentos){
        for (Instrumentos e : instrumentos){
            if (e instanceof Bateria){
                e.setPrecio(e.getPrecio()*1.15);
                System.out.println("Bateria :"+e.getPrecio()+" marca: "+e.getMarca());
            }
            else if (e instanceof Bajo){
                e.setPrecio(e.getPrecio()*1.20);
                System.out.println("Bajo :"+e.getPrecio()+" marca: "+e.getMarca());
            }
            else if (e instanceof Guitarra_Electrica){
                e.setPrecio(e.getPrecio()*1.05);
                System.out.println("Guitarra Electrica :"+e.getPrecio()+" marca: "+e.getMarca());
            }
            else if (e instanceof acustica){
                e.setPrecio(e.getPrecio()*1.10);
                System.out.println("Guitarra Acustica :"+e.getPrecio()+" marca: "+e.getMarca());
            }
        }
    }

    public static void Valores_sin_aumento(ArrayList<Instrumentos> instrumentos){
        for (Instrumentos e : instrumentos){
            if (e instanceof Bateria){
                System.out.println("Bateria :"+e.getPrecio()/1.15+" marca: "+e.getMarca());
            }
            else if (e instanceof Bajo){
                System.out.println("Bajo :"+e.getPrecio()/1.20+" marca: "+e.getMarca());
            }
            else if (e instanceof Guitarra_Electrica){
                System.out.println("Guitarra Electrica :"+e.getPrecio()/1.05+ "marca: "+e.getMarca());
            }
            else if (e instanceof acustica){
                System.out.println("Guitarra Acustica :"+e.getPrecio()/1.10+" marca: "+e.getMarca());
            }
        }
    }
}
