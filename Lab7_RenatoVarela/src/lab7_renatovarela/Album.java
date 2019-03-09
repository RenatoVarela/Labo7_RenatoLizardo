/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_renatovarela;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Asus Pc
 */
public class Album implements Serializable {
    String nombre_Album;
    String ano;
    String NombreArtista;
    ArrayList<Cancion> cancionesAlbum = new ArrayList();

    public Album(String nombre_Album, String ano, String NombreArtista) {
        this.nombre_Album = nombre_Album;
        this.ano = ano;
        this.NombreArtista = NombreArtista;
    }

    public Album() {
    }
    
    

    public String getNombre_Album() {
        return nombre_Album;
    }

    public void setNombre_Album(String nombre_Album) {
        this.nombre_Album = nombre_Album;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getNombreArtista() {
        return NombreArtista;
    }

    public void setNombreArtista(String NombreArtista) {
        this.NombreArtista = NombreArtista;
    }

    public ArrayList<Cancion> getCancionesAlbum() {
        return cancionesAlbum;
    }

    public void setCancionesAlbum(ArrayList<Cancion> cancionesAlbum) {
        this.cancionesAlbum = cancionesAlbum;
    }

    @Override
    public String toString() {
        return "Album{" + "nombre_Album=" + nombre_Album + ", ano=" + ano + ", NombreArtista=" + NombreArtista + ", cancionesAlbum=" + cancionesAlbum + '}';
    }
    
    
    
    
}
