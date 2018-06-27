/*
 * Testeaza sincronizarea threadurilor
 */
package multithreadingjava8;

/**
 * Testeaza sincronizarea threadurilor
 * @author gheor
 */
public class TestMultithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a Contor
        Contor c = new Contor();
        // create an addition Thread
        ThreadAdunare a = new ThreadAdunare(c);
        // create a substraction Thread
        ThreadScadere s = new ThreadScadere(c);
        // start both threads
        a.start();
        s.start();
    }
    
}
