package com.objetos2;

import com.objetos2.*;
import com.objetos2.ejercicio1.Autor;
import com.objetos2.ejercicio1.Libro;
import com.objetos2.ejercicio2.Cliente;
import com.objetos2.ejercicio2.Factura;
import com.objetos2.ejercicio2.ItemVenta;
import com.objetos2.ejercicio3.Cuenta;
import com.objetos2.ejercicio3.Titular;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*ejercicio1*/
        /*Autor autor=new Autor("Bloch", "Joshua", "joshua@email.com", 'M');
        System.out.println("Autor:\n"+autor.getGeneral());
        Autor[] autores=new Autor[2];
        autores[0]=autor;
        Libro libro=new Libro("Effective Java", 450, 150, autores);
        System.out.println("\n\nLibro: "+libro.getGeneral());
        libro.setSumarStock(50);
        libro.setPrecio(500);
        System.out.println(libro.getAutor());
        System.out.println(libro.getGeneralpublico());
        Autor autor2=new Autor("Jorge", "Borges", "borges@email.com", 'M');
        autores[1]=autor2;
        System.out.println(libro.getGeneralpublicomasdeuno());*/
        /*ejercicio2
        Cliente cliente1=new Cliente("Matias", "matiastorres@gmail.com", 50);
        System.out.println(cliente1.getGeneral());
        //Factura factura1=new Factura(7898, cliente1);
        //System.out.println("Total="+factura1.getTotal()+" Total con descuento aplicado "+factura1.getsetDescuentototal());
        //System.out.println("\n\n"+factura1.getGeneralfactura());*/

        /*ejercicio2.e
        ItemVenta[] item=new ItemVenta[5];
        item[0]=new ItemVenta("J7","Celular", 21000);
        item[1]=new ItemVenta("A52","Celular", 52000);
        item[2]=new ItemVenta("J2","Celular", 15000);

        Factura factura2=new Factura(cliente1, item);
        System.out.println(factura2.getGeneralfactura());

        item[3]=new ItemVenta("S20","Celular", 120000);
        item[4]=new ItemVenta("NOTE","Celular", 80000);

        System.out.println(factura2.getGeneralfactura());*/

        /*ejercicio3*/
        Scanner scan=new Scanner(System.in);
        Titular titular1=new Titular("matias", 'M');
        System.out.println(titular1.getGeneral());
        Cuenta banco1=new Cuenta(titular1, 10000);
        String s;
        do {
            System.out.println("Hola " + titular1.getNombre() + " aprete E para extraer de su cuenta y D para depositar");
            String accionbancaria = scan.next();
            if (accionbancaria.equalsIgnoreCase("E")) {
                System.out.println("Ingrese el monto que quiere Extraer: ");
                double i = scan.nextInt();
                banco1.setBalanceExtraccion(i);
            } else if (accionbancaria.equalsIgnoreCase("D")){
                System.out.println("Ingrese el monto que quiere Depositar: ");
                double i = scan.nextInt();
                banco1.setBalanceDeposito(i);
            }
            else {
                System.out.println("Ingreso una opcion invalida");
            }
            System.out.println(banco1.getDatosdelacuenta());

            System.out.println("\n\n");

            System.out.println("Ingrese s para hacer otra operacion");
            s=scan.next();

        }while (s.equalsIgnoreCase("s"));

        System.out.println("Registros");
        for (String n : banco1.getRegistros()){
            if (n!=null){
                System.out.println(n);
            }
        }
    }

}
