/*
 * Try to synchronize two threads
 */
package java6multithreading;

/**
 *
 * @author gheor
 */
public class TestIncrementDecrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create counter object
        Counter contor = new Counter();
        // create 2 threads
        Adunare add =  new Adunare(contor);
        Scadere dif = new Scadere(contor);
        // start the threads
        add.start();
        dif.start();
    }
    
}
