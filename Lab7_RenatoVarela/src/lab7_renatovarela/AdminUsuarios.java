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
import java.util.ArrayList;

/**
 *
 * @author Asus Pc
 */
public class AdminUsuarios {
      private ArrayList<Usuario> listaUsuarios = new ArrayList();
    private File archivo = null;

    public AdminUsuarios(String path) {
          archivo = new File(path);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
        public void setUsuarios(Usuario p) {
        this.listaUsuarios.add(p);
    }
    
    
    
    
    
    
        public void cargarArchivo(){
        
        
        try{
            listaUsuarios = new ArrayList();
            Usuario temp;
            
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                  try{
                while((temp = (Usuario)objeto.readObject()) != null){
                    listaUsuarios.add(temp);
                    
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
            for (persona t : listaUsuarios) {
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
