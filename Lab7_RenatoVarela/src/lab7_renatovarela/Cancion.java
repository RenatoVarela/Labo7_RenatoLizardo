/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_renatovarela;

import java.io.Serializable;

/**
 *
 * @author Asus Pc
 */
public class Cancion implements Serializable {
    String nombre_Cancion;
    String ano ;
    String nombreArtista;
    int duracion;

    public Cancion(String nombre_Cancion, String ano, String nombreArtista, int duracion) {
        this.nombre_Cancion = nombre_Cancion;
        this.ano = ano;
        this.nombreArtista = nombreArtista;
        this.duracion = duracion;
    }

    public Cancion() {
    }

    public String getNombre_Cancion() {
        return nombre_Cancion;
    }

    public void setNombre_Cancion(String nombre_Cancion) {
        this.nombre_Cancion = nombre_Cancion;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "\nnombre_Cancion=" + nombre_Cancion + ", ano=" + ano + ", nombreArtista=" + nombreArtista + ", duracion=" + duracion + "\n"+
                "-------------------------------------------------------"
                
                ;
    }
    
    
}
