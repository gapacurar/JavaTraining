/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posum;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class Counter {
    
    private volatile int contor = 0;

    public int getContor() {
        return contor;
    }

    public void setContor(int contor) {
        this.contor = contor;
    }
    
    
    
}
