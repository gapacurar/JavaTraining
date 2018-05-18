/*
 * Genric class Cutie
 */
package genericsjava8;

/**
 * Generic class Cutie
 * @author gheor
 * @param <T> generic type
 */
public class Cutie <T extends Incaltaminte> {
    
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
        
}
