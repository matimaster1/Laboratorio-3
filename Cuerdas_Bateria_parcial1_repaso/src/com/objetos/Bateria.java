package com.objetos;

public class Bateria extends Instrumentos{


    private static double costop_platillos=2000;
    private static double costop_tambores=3000;
    private int tambores=3;
    private int platillos=1;

    public Bateria(String marca, int tambores, int platillos) {
        super(marca);

        if (tambores>=3){
            this.tambores=tambores;
        }
        if (platillos<6){
            this.platillos=platillos;
        }
        else {
            this.platillos=5;
        }
        calcular_precio_final();
    }

    public void calcular_precio_final(){
        double preciofinal=this.platillos*costop_platillos+this.tambores*costop_tambores;
        super.setPrecio(preciofinal);
    }

    public static double getCostop_platillos() {
        return costop_platillos;
    }

    public static void setCostop_platillos(double costop_platillos) {
        Bateria.costop_platillos = costop_platillos;
    }

    public static double getCostop_tambores() {
        return costop_tambores;
    }

    public static void setCostop_tambores(double costop_tambores) {
        Bateria.costop_tambores = costop_tambores;
    }

    public int getTambores() {
        return tambores;
    }

    public void setTambores(int tambores) {
        this.tambores = tambores;
    }

    public int getPlatillos() {
        return platillos;
    }

    public void setPlatillos(int platillos) {
        this.platillos = platillos;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "tambores=" + tambores +
                ", platillos=" + platillos + "Precio:"+this.getPrecio()+" Marca:"+this.getMarca()+
                '}';
    }
}
