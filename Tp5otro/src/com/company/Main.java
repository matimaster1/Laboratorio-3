package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Celular cel1=new Celular("A20", "Samsung", "2235898117");
        Celular cel2=new Celular("A21", "LG", "2265898118");
        Celular cel3=new Celular("A22", "Nokia", "2235898119");
        Celular cel4=new Celular("A23", "Xiaomi", "2245898116");
        Celular cel5=new Celular("A24", "Motorola", "2235898417");
        Celular cel6=new Celular("A25", "Huawei", "2285898110");
        Celular cel7=new Celular("A26", "Samsung", "2635898127");
        Celular cel8=new Celular("A27", "Nokia", "9235898198");
        Celular cel9=new Celular("A28", "Samsung", "2205898757");
        Celular cel10=new Celular("A29", "Xiaomi", "2235898134");



	Comisionista com1=new Comisionista(4, 200);
    Comisionista com2=new Comisionista(8, 200);
    Comisionista com3=new Comisionista(7, 200);
    Comisionista com4=new Comisionista(2, 200);
    Comisionista com5=new Comisionista(1, 200);

        Repartidor rep1=new Repartidor(6, cel1, 100);
        Repartidor rep2=new Repartidor(9, cel2, 100);
        Repartidor rep3=new Repartidor(3, cel3, 100);
        Repartidor rep4=new Repartidor(7, cel4, 100);
        Repartidor rep5=new Repartidor(1, cel5, 100);

        Vendedor vend1=new Vendedor(20, cel6, 150);
        Vendedor vend2=new Vendedor(4, cel7, 150);
        Vendedor vend3=new Vendedor(6, cel8, 150);
        Vendedor vend4=new Vendedor(32, cel9, 150);
        Vendedor vend5=new Vendedor(2, cel10, 150);

        ArrayList<Empleado> empleados=new ArrayList<>();
        empleados.add(rep1);
        empleados.add(rep2);
        empleados.add(rep3);
        empleados.add(rep4);
        empleados.add(rep5);
        empleados.add(com1);
        empleados.add(com2);
        empleados.add(com3);
        empleados.add(com4);
        empleados.add(com5);
        empleados.add(vend1);
        empleados.add(vend2);
        empleados.add(vend3);
        empleados.add(vend4);
        empleados.add(vend5);

        DepartamentoComercial departamento1=new DepartamentoComercial(123, empleados);

        //cantidad de empleados por tipo
        System.out.println(""+departamento1.obtenerCantidadComisionista());
        System.out.println(""+departamento1.obtenerCantidadVendedores());
        System.out.println(""+departamento1.obtenerCantidadRepartidores());
        //cantidad especial
        System.out.println(""+departamento1.obtenerCantidadVendedoreconventasmenoral5());
        System.out.println(""+departamento1.obtenerCantidadComisionistaconmasde5entregas());
        System.out.println(""+departamento1.obtenerCantidadRepartidoresqueSuperanlas5salidas());
        System.out.println(""+departamento1.obtenerCantidadVendedoresconmarcaSamsung());


        //obtener un empleado
        System.out.println(""+departamento1.obtenerComisionistaconmenosEntregas());
        System.out.println(""+departamento1.obtenerRepartidorconmassalidas());
        System.out.println(""+departamento1.obtenerVendedorconmasPorcentaje());

        //aumentar sueldo //falla porque falta constructor para el empleado ya que no tienen sueldo
        System.out.println(departamento1.toString());
        departamento1.aplicarAumentos(20);
        System.out.println(departamento1.toString());

        //cuantosvendedorescon223
        System.out.println(departamento1.obtenerVendedorescon223());

    }
}
