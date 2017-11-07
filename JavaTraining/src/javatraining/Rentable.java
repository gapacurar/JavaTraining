/*
 * Rentable interface
 */
package javatraining;

/**
 *
 * @author gheorgheaurelpacurar
 */
public interface Rentable {
     /**
     @const RENTABLE is a constant that said something is rentable
     */
    public static final boolean RENTABLE = true;
    
    /**
     * Method returns the value of item that implements the saleable interface.
     * Class that implements the interface should implement this method.
     @return method returns price for daily rent
     */
    public int getDailyRentPrice();
}
