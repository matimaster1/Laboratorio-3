package com.objetos;

public class Album {
    private int añoDePublicacion;
    private Artista Artista;
    private String titulo;

    public Album(int añoDePublicacion, com.objetos.Artista artista, String titulo) {
        this.añoDePublicacion = añoDePublicacion;
        Artista = artista;
        this.titulo = titulo;
    }

    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public void setAñoDePublicacion(int añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
    }

    public com.objetos.Artista getArtista() {
        return Artista;
    }

    public void setArtista(com.objetos.Artista artista) {
        Artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
