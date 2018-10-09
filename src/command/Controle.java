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
public class Controle {
    
    Command comando;

    public Controle(Command comando) {
        this.comando = comando;
    }

    public void setComando(Command comando) {
        this.comando = comando;
    }
    
    public void enviarComando(){
        comando.execute();
    }
}
