/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;
/**
 *
 * @author lucas
 */

interface iterator{
    boolean hasNext();
    Object next();
}

public class EleitorIterator implements iterator{
    
    Eleitor[] eleitores;
    int pos = 0;

    public EleitorIterator(Eleitor[] eleitores) {
        this.eleitores = eleitores;
    }

    @Override
    public boolean hasNext() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(pos >= eleitores.length || eleitores[pos] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Eleitor eleitor = eleitores[pos];
        pos++;
        return eleitor;
    }
    
    
    
}
