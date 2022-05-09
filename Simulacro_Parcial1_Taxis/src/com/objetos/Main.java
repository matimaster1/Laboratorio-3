package com.objetos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Vehiculos> vehiculos=new ArrayList<>();
        Taxis.precioxkilometro=100;
        Taxis.bajada_de_bandera=30;
        Remises.tarifaxcuadra=6;

        vehiculos.add(new Taxis("Ford", "208", "gas", "AHG123"));
        vehiculos.add(new Remises("Ford", "208", "nafta", "AHG123"));

        Sistema_de_Viajes sistema=new Sistema_de_Viajes(vehiculos);

        sistema.ViajeNuevoRemis(new Clientes("Matias", "Torres", 22344545, "colon al 1500"), 100);
        sistema.ViajeNuevoTaxi(new Clientes("Matiass", "Torress", 223445459, "colon al 1570"), 10);


        System.out.println(sistema.registropedidos());
        sistema.ViajeFinalizado(1);
        System.out.println(sistema.registropedidos());
        sistema.ViajeFinalizado(2);
        System.out.println(sistema.registropedidos());

        System.out.println(sistema.Registro_Dinero_Recaudado());

    }
}
