/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_renatovarela;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Asus Pc
 */
public class PlayList implements Serializable {
    String nombre;
    String generoMusical;
    Date fecha_creacion;
    ArrayList<Cancion> cancionesPlaylist = new ArrayList();
    int duracion;

    public PlayList(String nombre, String generoMusical, Date fecha_creacion, int duracion) {
        this.nombre = nombre;
        this.generoMusical = generoMusical;
        this.fecha_creacion = fecha_creacion;
        this.duracion = duracion;
    }

    public PlayList() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public ArrayList<Cancion> getCancionesPlaylist() {
        return cancionesPlaylist;
    }

    public void setCancionesPlaylist(ArrayList<Cancion> cancionesPlaylist) {
        this.cancionesPlaylist = cancionesPlaylist;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", generoMusical=" + generoMusical + ", fecha_creacion=" + fecha_creacion + " duracion=" + duracion + ", cancionesPlaylist=" + cancionesPlaylist + '}';
    }
    
    
    
}
