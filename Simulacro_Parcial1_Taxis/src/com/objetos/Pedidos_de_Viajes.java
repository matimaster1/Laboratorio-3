package com.objetos;

public class Pedidos_de_Viajes {
    private Clientes cliente;
    private Vehiculos vehiculo;
    private double precio_final;
    private static int idsig=1;
    private  int id;

    public Pedidos_de_Viajes(Clientes cliente, Vehiculos vehiculo, double precio) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.precio_final=precio;
        id=idsig;
        idsig++;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Pedidos_de_Viajes{" +" ID="+getId()+
                " cliente=" + this.cliente +
                ", vehiculo=" + this.vehiculo.getClass().getSimpleName() +
                ", precio_final=" + this.precio_final + " Disponibilidad: "+this.vehiculo.getDisponible()+
                '}';
    }

    public double getPrecio_final(){
        return this.precio_final;
    }
}
