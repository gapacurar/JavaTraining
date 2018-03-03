/*
 * Tests threads sync
 */
package multithreadingjava7;

/**
 * Tests threads sync
 * @author gheor
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Counter c = new Counter();
        Add add = new Add(c);
        Substract sub = new Substract(c);
        System.out.println("Initial value of counter: "+c.value());
        add.start();
        sub.start();
        System.out.println("FInal value of counter: "+c.value());
    }
    
}
