package com.objetos;

public class Revistas extends Ejemplares  implements control_de_ejemplares{


    private int stock=1;

    public Revistas(double codigo, String titulo, int año_de_publicacion) {
        super(codigo, titulo, año_de_publicacion);
    }


    public int getStock() {
        return stock;
    }


    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int alquilar(){
        if (this.stock>0){
            this.stock=this.stock-1;
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public void devolver() {
        this.stock=this.stock+1;
    }

    @Override
    public boolean alquilado() {
        if (this.stock>0){
            return false;
        }
        else {
            return true;
        }
    }

}
