package com.objetos;

public interface Reproduccion {

    void Reproduccion();//Debe mostrar la canción en reproducción, junto con el nombre del ánlbum, género y nombre del artista junto con el artista invitado si es que hay.
    void AnadirCancion(Cancion cancion);// recibe una canción por parámetro y la guarda en la lista en reproducción.
    void EliminarCancion(String cancion);//mostrará las canciones de la lista en reproducción y permitirá elegir una para eliminar
    void VermiLista();//Nos permite ver nuestra lista de reproducción.
}
