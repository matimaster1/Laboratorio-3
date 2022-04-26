package com.objetos2.ejercicio2;

import java.util.UUID;

public class ItemVenta {
    private String iditem;
    private String nombreitem;
    private String descripcionitem;
    private double preciounitario;

    public ItemVenta(String nombreitem, String descripcionitem, double preciounitario){
        UUID idaleatorio=UUID.randomUUID();
        this.iditem=idaleatorio.toString();
        this.descripcionitem=descripcionitem;
        this.nombreitem=nombreitem;
        this.preciounitario=preciounitario;
    }

    public double getPreciounitario(){return this.preciounitario;}
}
