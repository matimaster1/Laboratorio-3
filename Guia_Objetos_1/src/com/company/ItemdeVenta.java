package com.company;

public class ItemdeVenta {
    private int identificador;
    private String descripcion;
    private int cantidad;
    private double preciounitario;

    public ItemdeVenta(){
        this.identificador=0;
        this.descripcion="ninguna";
        this.cantidad=0;
        this.preciounitario=0;
    }

    private double getPreciotoral(){
        return this.preciounitario*this.cantidad;
    }

    public  String getDescripcióngenral(){
        return "ItemVenta: [id="+this.identificador+", descripción="+this.descripcion+", cantidad="+this.cantidad+
                ", pUnitario=$"+this.preciounitario+", pTotal=$"+getPreciotoral()+"]";
    }

    public void setIdentificador(int id){
        this.identificador=id;
    }

    public void setCantidad(int cant){
        this.cantidad=cant;
    }

    public void setPreciounitario(double preciounitario){
        this.preciounitario=preciounitario;
    }

    public void setDescripción(String descripcion){
        this.descripcion=descripcion;
    }

    public int getIdentificador(){
        return  this.identificador;
    }
    public int getCantidad(){
        return this.cantidad;
    }

    public double getPreciounitario(){
        return this.preciounitario;
    }

    public String getDescripcion(){
       return this.descripcion;
    }


}
