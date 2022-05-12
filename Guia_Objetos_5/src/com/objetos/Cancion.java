package com.objetos;

public class Cancion {
    private String nombre;
    private int duracion;
    private String genero;
    private Album Album;
    private Artista ArtistaInvitado;

    public Cancion(String nombre, int duracion, String genero, com.objetos.Album album, Artista artistaInvitado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        Album = album;
        ArtistaInvitado = artistaInvitado;
    }

    public Cancion(String nombre, int duracion, String genero, com.objetos.Album album) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        Album = album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public com.objetos.Album getAlbum() {
        return Album;
    }

    public void setAlbum(com.objetos.Album album) {
        Album = album;
    }

    public Artista getArtistaInvitado() {
        return ArtistaInvitado;
    }

    public void setArtistaInvitado(Artista artistaInvitado) {
        ArtistaInvitado = artistaInvitado;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", Album=" + Album +
                ", ArtistaInvitado=" + ArtistaInvitado +
                '}';
    }
}
