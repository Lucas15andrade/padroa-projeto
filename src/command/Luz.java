/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author lucas
 */
public class Luz {
    
    private boolean estado = false;

    public Luz() {
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //public void getEstado
    
    public void ligar(){
        this.estado = true;
    }
    
    public void desligar(){
        this.estado = false;
    }
}
