/*
 * Testing multithreading sync using shared memory
 */
package multithreading;

/**
 * Testing multithreading sync using shared memory
 * @author gheorgheaurelpacurar
 */
public class Testare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create counter
        Contor c = new Contor();
        // create 2 threads
        Add adunare = new Add(c);
        Substract scadere = new Substract(c);
        // run methods for new created threads
        scadere.start();
        adunare.start();
        // Display value of c
        System.out.println(c.value());
    }
    
}
