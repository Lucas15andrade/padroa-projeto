/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojeto;

import Iterator.Eleitor;
import Iterator.EleitorIterator;
import command.Controle;
import command.Luz;
import strategy.CalcularConsumo;
import strategy.Fox;
import strategy.Gol;

/**
 *
 * @author lucas
 */
public class PadroesProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Teste padrão de projeto Iterator
        /*
        Eleitor[] eleitores = new Eleitor[3];
        eleitores[0] = new Eleitor(888);
        eleitores[1] = new Eleitor(999);
        eleitores[2] = new Eleitor(100);
        
        EleitorIterator el = new EleitorIterator(eleitores);
        
        while(el.hasNext()){
            Eleitor eleitorCidadao = (Eleitor) el.next();
            System.out.println("Título: "+eleitorCidadao.getTitulo());
        }
         */
        //Teste do padrão de projeto strategy
        /*
        CalcularConsumo cc = new CalcularConsumo();
        
        Fox carroFox = new Fox();
        Gol carroGol = new Gol();
        
        System.out.println("Consumo fox: "+cc.calculaConsumo(carroFox));
        System.out.println("Consumo gol: "+cc.calculaConsumo(carroGol));
         */
        
        
        //Teste do padrão de projeto Command
        
//        Luz luz = new Luz();
//        
//        Command comando = luz.ligar();
//        Controle controle = new Controle(comando);     
//        controle.enviarComando();
    }

}
