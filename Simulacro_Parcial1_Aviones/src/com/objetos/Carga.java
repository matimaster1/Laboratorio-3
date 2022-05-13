package com.objetos;

import java.util.ArrayList;

public class Carga extends Avion implements MetododeIngreso{
    private int kilos;
    private ArrayList<String> productos=new ArrayList<>();

    public Carga(String modelo, String marca, String tipoDeMotor, int kilos) {
        super(modelo, marca, tipoDeMotor, 0);
        this.kilos = kilos;
    }

    public  void  agregarProductos(String producto){
        this.productos.add(producto);
    }

    public void descargarContenido(String producto){
        for (int i=0; i<this.productos.size(); i++){
            if (this.productos.get(i).equalsIgnoreCase(producto)){
                this.productos.remove(i);
            }
        }
    }

    @Override
    public boolean Ingresar() {
        return false;
    }

    @Override
    public String toString() {
        return "Carga{" +" Estado="+this.getEstado()+
                " kilos=" + kilos +
                ", productos=" + productos +
                '}';
    }
}