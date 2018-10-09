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
public class TesteCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Luz luz = new Luz();
        LuzComando luzComando = new LuzComando(luz);
        
        System.out.println("Estado da luz: "+luz.isEstado());
        
        //Command comando;
        Controle controle = new Controle(luzComando);     
        controle.enviarComando();
        
        System.out.println("Estado da luz: "+luz.isEstado());
    }
    
}
