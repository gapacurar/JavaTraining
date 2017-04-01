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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Counter counter = new Counter();
        
        //for(int i=0; i <500; i++){
            Adunare a = new Adunare(counter);
            Scadere s = new Scadere(counter);
            a.start();
            s.start();            
            System.out.println("Counter="+counter.getContor());
        //}
    }
}
