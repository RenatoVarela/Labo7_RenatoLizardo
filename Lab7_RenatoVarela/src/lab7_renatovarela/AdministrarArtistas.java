/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_renatovarela;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Asus Pc
 */
public class AdministrarArtistas  {
    private ArrayList<Artista> listaArtistas = new ArrayList();
    private File archivo = null;

    public AdministrarArtistas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    
    public void setArtistas(Artista p) {
        this.listaArtistas.add(p);
    }
    
    
    
    
    
    
        public void cargarArchivo(){
        
        
        try{
            listaArtistas = new ArrayList();
            Artista temp;
            
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                  try{
                while((temp = (Artista)objeto.readObject()) != null){
                    listaArtistas.add(temp);
                    
                }
            }catch(EOFException e){
                
            }
              
            }
            
          
            
        }catch(Exception e){
            
        }
    
        
    }
    
    
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try{
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (persona t : listaArtistas) {
                bw.writeObject(t);
            }
            bw.flush();
            
        }catch(Exception ex){
        }finally{
            try{
                bw.close();
                fw.close();
                
            }catch(Exception ex){
                
            }
            
        }
    }
    
    
    
    
    
    
    
    
}
