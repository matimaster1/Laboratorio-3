package com.objetos;

import java.util.ArrayList;

public class Sistema_de_Pesca {
    private ArrayList<Barcos> barcos;
    private static double totalRecaudado;


    public Sistema_de_Pesca(ArrayList barcos) {

        this.barcos = barcos;
    }

    public String Recoleccion(String patente, int horas){
        for (int i=0; i<barcos.size(); i++){
            if (barcos.get(i).getPatente().equalsIgnoreCase(patente)){
                if (barcos.get(i).isPescando()==false){
                    if (barcos.get(i) instanceof Lanchas_Amarillas){
                        double totalDelaPesca=((Lanchas_Amarillas) barcos.get(i)).recolectar(horas);
                        barcos.get(i).setPescando(true);
                        return "Recolecto "+((Lanchas_Amarillas) barcos.get(i)).capacidadDeCarga(horas)+" kilos de Merluza"+ " un total de $"+totalDelaPesca;
                    }
                    else {
                        double totalDelaPesca=((Corbetas)barcos.get(i)).recolectar();
                        barcos.get(i).setPescando(true);
                        return "Recolecto "+((Corbetas) barcos.get(i)).capacidadDeCarga()+" kilos de Merluza"+ " un total de $"+totalDelaPesca;
                    }
                }
                else {
                    return "el barco está pescando";
                }
            }
        }
        return "el barco no existe, debe listarlo primero";
    }

    public void AgregarBarco(Barcos nuevo){
        this.barcos.add(nuevo);
    }

    public String mostrarListado(){
        return this.barcos.toString();
    }

    public void ListarBarco(String patente){
        for (int i=0; i<barcos.size(); i++) {
            if (barcos.get(i).getPatente().equalsIgnoreCase(patente)) {
                barcos.get(i).setPescando(false);
            }
        }
    }

    public double getTotalRecaudado(){
        totalRecaudado=Corbetas.totalRecaudado+Lanchas_Amarillas.totalRecaudado;
        return totalRecaudado;
    }








}
