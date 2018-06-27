/*
 * Class Contor
 */
package multithreadingjava8;

/**
 *
 * @author gheor
 */
public class Contor {
    private volatile int contor =0;
    
    /**
     * Synchronized method
     */
    public synchronized void add(){
        contor++;
        System.out.println("Add one = "+contor);
    }
    /**
     * Synchronized method
     */    
    public synchronized void sub(){
        contor--;
        System.out.println("Substracted one = "+contor);
    }
    
}
