package com.objetos2.ejercicio2;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class Factura {
    private static String idfactura;
    //private double total;
    private LocalDateTime fecha;
    private Cliente comprador;
    private ItemVenta[] items;

    public Factura(/*double total, */Cliente cliente, ItemVenta[] items){
        UUID id=UUID.randomUUID();
        this.idfactura=id.toString();
        this.fecha=LocalDateTime.now();
        //this.total=total;
        this.comprador=cliente;
        this.items=items;
    }
    
    /*public double getsetDescuentototal(){
        double n=this.total*this.comprador.getDescuento();
        n=n/100;
        return n;
    }*/

    //public double getTotal(){return this.total;}

    /*public String getGeneralfactura(){
        return "Factura[id="+this.idfactura+", fecha="+this.fecha+", monto="+this.total+", montoDesc="+getsetDescuentototal()+", "+comprador.getGeneral()+"]";
    }*/


    public double getTotal(){
        double total=0;
        for (ItemVenta n: this.items){
            if (n!=null){
                total+=n.getPreciounitario();
            }
        }
        return total;
    }

    public double getsetDescuentototal2(){
        double total=0;
        for (ItemVenta n: this.items){
            if (n!=null){
                total+=n.getPreciounitario();
            }
        }
        return total=(total*this.comprador.getDescuento())/100;
    }
    public String getGeneralfactura(){
        return "Factura[id="+this.idfactura+", fecha="+this.fecha+", monto="+getTotal()+", montoDesc="+getsetDescuentototal2()+"\n"+comprador.getGeneral()+"]";
    }




}
