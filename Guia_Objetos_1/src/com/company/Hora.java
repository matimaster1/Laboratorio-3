package com.company;

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {

        this.hora=(hora >=0 && hora <= 23) ? hora : 0;
        this.minuto=(minuto>=0 && minuto<=59) ? minuto : 0;
        this.segundo=(segundo>=0 && segundo<=59) ? segundo : 0;

    }

    private void setHorasumar(){
        if (this.hora==23){
            this.hora=0;
        }
        else {
            this.hora++;
        }
    }

    private void setMinutosumar(){
        if (this.minuto==59){
            this.minuto=0;
            setHorasumar();
        }
        else {
            this.minuto++;
        }
    }

    public Hora getsetSumarseg(){
        if (this.segundo==59){
            this.segundo=0;
            setMinutosumar();
        }
        else {
            this.segundo++;
        }

        return this;
    }
    private void setHorarestar(){
        if (this.hora==0){
            this.hora=23;
        }
        else {
            this.hora--;
        }
    }

    private void setMinutorestar(){
        if (this.minuto==0){
            this.minuto=59;
            setHorarestar();
        }
        else {
            this.minuto--;
        }
    }

    public Hora getsetRestseg(){
        if (this.segundo==0){
            this.segundo=59;
            setMinutorestar();
        }
        else {
            this.segundo--;
        }
        return this;
    }

    public String getHoracompleta() {
        String hh = String.format("%02d", this.hora);
        String mm = String.format("%02d", this.minuto);
        String ss = String.format("%02d", this.segundo);

        return hh + ":" + mm + ":" + ss;
    }
}


