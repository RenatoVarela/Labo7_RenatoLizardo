/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_renatovarela;

import javax.swing.JProgressBar;

/**
 *
 * @author Asus Pc
 */
public class Play extends Thread {
    
    
        private JProgressBar barra;
    private boolean Aumento;
    private boolean Continuar;
    int duracion;

    public  Play(JProgressBar barra , int duracion) {
        this.barra = barra;
        this.duracion = duracion;
        Aumento = true;
        Continuar = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAumento() {
        return Aumento;
    }

    public void setAumento(boolean avanzar) {
        this.Aumento = avanzar;
    }

    public boolean isContinuar() {
        return Continuar;
    }

    public void setContinuar(boolean vive) {
        this.Continuar = vive;
    }
    
    
    @Override
    public void run(){//pner siempre el sleep para obtener paramentros
        while(Aumento){
            barra.setValue(barra.getValue()+1);
            if (barra.getValue() == duracion) {
                Continuar = false;
                
            }
            
        }
        
        try {
            Thread.sleep(50);
            //al poner sleep es una interrupcion
        } catch (InterruptedException e) {
        }
        
    }
    
}
