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
public class Artista extends persona {
    ArrayList<Usuario> usuarios = new ArrayList();
      ArrayList<Album> albumes = new ArrayList();

    public Artista() {
    }

    public Artista(String nombre, String apellido, String Usuario, String contrasena, Date fecha) {
        super(nombre, apellido, Usuario, contrasena, fecha);
    }

    public ArrayList<lab7_renatovarela.Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<lab7_renatovarela.Usuario> usuarios) {
        this.usuarios = usuarios;
    }
   
    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return "Artista{" + "usuarios=" + usuarios + ", albumes=" + albumes + '}';
    }
    
    
    
    
      
      
    
}
