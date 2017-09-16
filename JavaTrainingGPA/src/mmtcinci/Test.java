/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmtcinci;

/**
 *
 * @author gheor
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create instances of different threads
        Counter contor = new Counter();
        Adunare aduna = new Adunare(contor);
        Scadere scade = new Scadere(contor);
        
        aduna.start();
        scade.start();

       
    }
    
}
