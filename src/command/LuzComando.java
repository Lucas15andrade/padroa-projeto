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
public class LuzComando implements Command{

    Luz luz;

    public LuzComando(Luz luz) {
        this.luz = luz;
    }
    
    @Override
    public void execute() {
        this.luz.ligar();
    }
    
}
