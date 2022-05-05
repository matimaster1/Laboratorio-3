package com.objetos;

public class Diarios extends Ejemplares {

    private boolean disponible=true;


    public Diarios(double codigo, String titulo, int año_de_publicacion) {
        super(codigo, titulo, año_de_publicacion);
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


}
