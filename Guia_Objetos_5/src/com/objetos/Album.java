package com.objetos;

import java.util.Objects;

public class Album implements Comparable<Album>{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return añoDePublicacion == album.añoDePublicacion && Objects.equals(Artista, album.Artista) && Objects.equals(titulo, album.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(añoDePublicacion, Artista, titulo);
    }

    @Override
    public int compareTo(Album o) {

        return 0;
    }
}
