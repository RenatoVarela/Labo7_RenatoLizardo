/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_renatovarela;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Asus Pc
 */
public class Usuario extends persona {
  
    ArrayList<PlayList> playlist = new ArrayList();
    ArrayList<Artista> artista = new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String Usuario, String contrasena, Date fecha) {
        super(nombre, apellido, Usuario, contrasena, fecha);
    }

    public ArrayList<PlayList> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<PlayList> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<Artista> getArtista() {
        return artista;
    }

    public void setArtista(ArrayList<Artista> artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Usuario{" + "playlist=" + playlist + ", artista=" + artista + '}';
    }

    

    
    
    
    
    
}
