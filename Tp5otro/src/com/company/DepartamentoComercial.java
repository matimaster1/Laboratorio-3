package com.company;

import java.util.ArrayList;

public class DepartamentoComercial {
    private int CodigoDepto;
    private ArrayList<Empleado> empleados;

    public DepartamentoComercial(int codigoDepto, ArrayList<Empleado> empleados) {
        CodigoDepto = codigoDepto;
        this.empleados = empleados;
    }

    public int obtenerCantidadRepartidoresqueSuperanlas5salidas(){
        int i=0;
        for (Empleado e : empleados){
            if (e instanceof Repartidor){
                if (((Repartidor) e).getSalidasPorDia()>5){
                    i++;
                }
            }
        }
        return i;
    }

    public int obtenerCantidadVendedoreconventasmenoral5(){
        int i=0;
        for (Empleado e : empleados){
            if (e instanceof Vendedor){
                if (((Vendedor) e).getPorcentajeComision()<5){
                    i++;
                }
            }
        }
        return i;
    }

    public int obtenerCantidadComisionistaconmasde5entregas(){
        int i=0;
        for (Empleado e : empleados){
            if (e instanceof Comisionista){
                if (((Comisionista) e).getCantidadEntregas()>=5){
                    i++;
                }
            }
        }
        return i;
    }

    public int obtenerCantidadVendedoresconmarcaSamsung(){
        int i=0;
        for (Empleado e : empleados){
            if (e instanceof Vendedor){
                if (((Vendedor) e).getCelularasignado().getMarca().equalsIgnoreCase("Samsung")){
                    i++;
                }
            }
        }
        return i;
    }

    public Vendedor obtenerVendedorconmasPorcentaje(){
        Vendedor vendedor=new Vendedor(0, null, 0);
        for (Empleado e : empleados){
            if (e instanceof Vendedor){
                if (vendedor.getPorcentajeComision()<((Vendedor) e).getPorcentajeComision()){
                    vendedor=(Vendedor) e;
                }
            }
        }
        return vendedor;
    }

    public Repartidor obtenerRepartidorconmassalidas(){
        Repartidor repartidor=new Repartidor(0, null, 0);
        for (Empleado e : empleados){
            if (e instanceof Repartidor){
                if (repartidor.getSalidasPorDia()<((Repartidor) e).getSalidasPorDia()){
                    repartidor=(Repartidor) e;
                }
            }
        }
        return repartidor;
    }

    public Comisionista obtenerComisionistaconmenosEntregas(){
        Comisionista comisionista=new Comisionista(10, 0);
        for (Empleado e : empleados){
            if (e instanceof Comisionista){
                if (comisionista.getCantidadEntregas()>((Comisionista) e).getCantidadEntregas()){
                    comisionista=(Comisionista) e;
                }
            }
        }
        return comisionista;
    }






    public void aplicarAumentos(float porcentaje){
        for (Empleado e : empleados){
            e.setSalarioBase((e.getSalarioBase()*porcentaje)/100+e.getSalarioBase());
        }
    }

    public int obtenerCantidadVendedores(){
        int i=0;
        for (Empleado e : empleados){
            if (e instanceof Vendedor){
                i++;
            }
        }
        return i;
    }
    public int obtenerCantidadComisionista(){
        int i=0;
        for (Empleado e : empleados){
            if (e instanceof Comisionista){
                i++;
            }
        }
        return i;
    }

    public int obtenerCantidadRepartidores(){
        int i=0;
        for (Empleado e : empleados){
            if (e instanceof Repartidor){
                i++;
            }
        }
        return i;
    }

    public int obtenerVendedorescon223(){
        int i=0;
        for (Empleado e : empleados){
            if (e instanceof Vendedor){
                    if (((Vendedor) e).getCelularasignado().getNumero().substring(0, 3).equalsIgnoreCase("223")){
                        i++;
                    }
            }
        }
        return i;
    }

    @Override
    public String toString() {
        return "DepartamentoComercial{" +
                "CodigoDepto=" + CodigoDepto +
                ", empleados=" + empleados +
                '}';
    }


}
