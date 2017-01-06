/*
 * Shared variable class
 */
package multithreading;

/**
 * Shared variable class
 * @author gheorgheaurelpacurar
 */
public class Contor {
    
    private int c;
    
    /** 
     Method increments c
     */
    public void incrementeazaContor(){
        c++;
    }
    /** 
     Method decrements c
     */    
    public void decrementeazaContor(){
        c--;
    }

    public int value() {
        return c;
    }
    /**
     Method display value of contor
     */
    
    
}
