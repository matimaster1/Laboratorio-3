package com.objetos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private ArrayList<Revistas> revistas=new ArrayList<>();
    private ArrayList<Libros> libros=new ArrayList<>();
    private ArrayList<Diarios> diarios=new ArrayList<>();
    private double codigo=0;

    public Biblioteca() {
    }

    public String CrearLibro(String titulo, int ano_de_publicacion, String genero) {
        Libros librito=new Libros(this.codigo, titulo, ano_de_publicacion, genero);
        this.libros.add(librito);
        this.codigo=this.codigo+1;
        return librito.toString();
    }

    public String CrearRevista(String titulo, int ano_de_publicacion) {
        Revistas revistita=new Revistas(this.codigo, titulo, ano_de_publicacion);
        this.revistas.add(revistita);
        this.codigo=this.codigo+1;
        return revistita.toString();
    }

    public String CrearDiario(String titulo, int ano_de_publicacion) {
        Diarios diarito=new Diarios(this.codigo, titulo, ano_de_publicacion);
        this.diarios.add(diarito);
        this.codigo=this.codigo+1;
        return diarito.toString();
    }

    public String Alquilar_Libro(double codigo){
        for (int i=0; i<this.libros.size(); i++){
            if (codigo==this.libros.get(i).getCodigo()){
                if (this.libros.get(i).getStock()==1){
                    this.libros.get(i).alquilar();
                    return "Alquilado con Exito";
                }
            }
        }
        return "No Se encuentra Disponible";
    }

    public String Alquilar_Revista(double codigo){
        for (int i=0; i<this.revistas.size(); i++){
            if (codigo==this.revistas.get(i).getCodigo()){
                if (this.revistas.get(i).getStock()==1){
                    this.revistas.get(i).alquilar();
                    return "Alquilado con Exito";
                }
            }
        }
        return "No Se encuentra Disponible";
    }


    public String Alquilar_Diario(double codigo){
        for (int i=0; i<this.diarios.size(); i++){
            if (codigo==this.diarios.get(i).getCodigo()){
                if (this.diarios.get(i).isDisponible()){
                    this.diarios.get(i).setDisponible(false);
                    return "Alquilado con Exito";
                }
            }
        }
        return "No Se encuentra Disponible";
    }

    public String Devolver_Diario(double codigo){
        for (int i=0; i<this.diarios.size(); i++){
            if (codigo==this.diarios.get(i).getCodigo()){
                if (this.diarios.get(i).isDisponible()==false){
                    this.diarios.get(i).setDisponible(true);
                    return "Devuelto con Exito";
                }
            }
        }
        return "Ya fue devuelto anteriormente";
    }

    public String Devolver_Revista(double codigo){
        for (int i=0; i<this.revistas.size(); i++){
            if (codigo==this.revistas.get(i).getCodigo()){
                if (this.revistas.get(i).alquilado()==true){
                    this.revistas.get(i).setStock(1);
                    return "Devuelto con Exito";
                }
            }
        }
        return "Ya fue devuelto anteriormente";
    }

    public String Devolver_Libros(double codigo){
        for (int i=0; i<this.libros.size(); i++){
            if (codigo==this.libros.get(i).getCodigo()){
                if (this.libros.get(i).alquilado()==true){
                    this.libros.get(i).setStock(1);
                    return "Devuelto con Exito";
                }
            }
        }
        return "Ya fue devuelto anteriormente";
    }

    public String Listado_ejemplares_disponibles(){
        List<Ejemplares> disponibles=new ArrayList<>();
        for (int i=0; i<this.revistas.size(); i++){
            if (this.revistas.get(i).alquilado()==false){
                disponibles.add(this.revistas.get(i));
            }
        }
        for (int i=0; i<this.diarios.size(); i++){
            if (this.diarios.get(i).isDisponible()==true){
                disponibles.add(this.diarios.get(i));
            }
        }
        for (int i=0; i<this.libros.size(); i++){
            if (this.libros.get(i).alquilado()==false){
                disponibles.add(this.libros.get(i));
            }
        }
        return disponibles.toString();
    }

    public String Listado_ejemplares_no_disponibles(){
        List<Ejemplares> disponibles=new ArrayList<>();
        for (int i=0; i<this.revistas.size(); i++){
            if (this.revistas.get(i).alquilado()==true){
                disponibles.add(this.revistas.get(i));
            }
        }
        for (int i=0; i<this.diarios.size(); i++){
            if (this.diarios.get(i).isDisponible()==false){
                disponibles.add(this.diarios.get(i));
            }
        }
        for (int i=0; i<this.libros.size(); i++){
            if (this.libros.get(i).alquilado()==true){
                disponibles.add(this.libros.get(i));
            }
        }
        return disponibles.toString();
    }


}
