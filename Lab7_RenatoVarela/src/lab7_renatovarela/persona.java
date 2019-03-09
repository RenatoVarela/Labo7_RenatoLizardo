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
public class persona implements Serializable {
      String nombre;
    String apellido;
    String Usuario;
    String contrasena;
    Date fecha;
    ArrayList<Cancion> canciones = new ArrayList();

    public persona() {
    }

    public persona(String nombre, String apellido, String Usuario, String contrasena, Date fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Usuario = Usuario;
        this.contrasena = contrasena;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", Usuario=" + Usuario + ", contrasena=" + contrasena + ", fecha=" + fecha + ", canciones=" + canciones + '}';
    }
    
    
    
    
}
