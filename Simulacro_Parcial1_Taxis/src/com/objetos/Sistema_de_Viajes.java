package com.objetos;

import java.util.ArrayList;

public class Sistema_de_Viajes {
    private ArrayList<Pedidos_de_Viajes> pedido=new ArrayList<>();
    private ArrayList<Vehiculos> vehiculos;
    private ArrayList<Clientes> clientes=new ArrayList<>();
    private static double recaudado=0;

    public Sistema_de_Viajes(ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void ViajeNuevoTaxi(Clientes cliente, double kilometros){


        for (Clientes e : clientes){
            if (e.getNombre().equalsIgnoreCase(cliente.getNombre())==true && e.getApellido().equalsIgnoreCase(cliente.getApellido())==true){
                cliente=e;
            }
        }


        for (int i=0; i<vehiculos.size(); i++){
            if (vehiculos.get(i) instanceof Taxis){
                if (vehiculos.get(i).getDisponible()){
                    ((Taxis) vehiculos.get(i)).setContador_de_kilometros(kilometros);
                    pedido.add(new Pedidos_de_Viajes(cliente, vehiculos.get(i), ((Taxis) vehiculos.get(i)).CalcularPrecio()));
                    vehiculos.get(i).setDisponible(false);
                    break;
                }
            }
        }
    }

    public void ViajeNuevoRemis(Clientes cliente, int cuadras){

        for (Clientes e : clientes){
            if (e.getNombre().equalsIgnoreCase(cliente.getNombre())==true && e.getApellido().equalsIgnoreCase(cliente.getApellido())==true){
                cliente=e;
            }
        }

        for (int i=0; i<vehiculos.size(); i++){
            if (vehiculos.get(i) instanceof Remises){
                if (vehiculos.get(i).getDisponible()){
                    ((Remises) vehiculos.get(i)).setCantidaddecuadras(cuadras);
                    pedido.add(new Pedidos_de_Viajes(cliente, vehiculos.get(i), ((Remises) vehiculos.get(i)).CalcularPrecio()));
                    vehiculos.get(i).setDisponible(false);

                    break;
                }
            }
        }
    }

    public void ViajeFinalizado(int id_delviaje){
        for (int i=0; i<pedido.size(); i++){
            if (pedido.get(i).getId()==id_delviaje){
                recaudado=recaudado+pedido.get(i).getPrecio_final();
                pedido.get(i).getVehiculo().setDisponible(true);
                pedido.remove(pedido.get(i));
                break;
            }
        }
    }

    public String registropedidos(){
        return pedido.toString();
    }

    public double Registro_Dinero_Recaudado(){
        return recaudado;
    }



}
