package com.objetos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Aeropuerto Piazolla=new Aeropuerto("Piazolla", "Buenos Aires 234", 7, 84382742);
        Avion militar1=new Militar("ASD", "Peugot", "asd223", 4, 4324, "aire-tierra");
        Avion militar2=new Militar("ASDSD", "FORD", "sdfs454", 8, 987, "aire-aire");
        Avion comerdcial1=new Comercial("GDF", "dragonbal", "asd223", 40, 4);
        Avion comercial2=new Comercial("DER", "felix", "sdfsf33", 99, 9);
        Avion Privado1=new Privado("dfsdf", "kjhkh", "fg67", 8, true, "unbuen10",  false);
        Avion Privado2=new Privado("sdasd", "gdffg", "fdgdf565", 4, false, "aire45", true);
        Avion Carga1=new Carga("fsdf5", "fdggf", "iuou8", 9500);
        Avion Carga2=new Carga("fgf", "7867", "fdgdf22", 5877);

        Piazolla.AgregarAvion(militar1);
        Piazolla.AgregarAvion(militar2);
        Piazolla.AgregarAvion(comerdcial1);
        Piazolla.AgregarAvion(comercial2);
        Piazolla.AgregarAvion(Privado1);
        Piazolla.AgregarAvion(Privado2);
        Piazolla.AgregarAvion(Carga1);
        //Piazolla.AgregarAvion(Carga2);

        Piazolla.HacerDespegarAngar(Piazolla.getHangarMilitar());

        System.out.println(Piazolla);



    }
}
