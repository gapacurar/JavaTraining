/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatraining;

/**
 *
 * @author gheorgheaurelpacurar
 */
public interface Rentable {
     /**
     @const REC_RENT_PRICE is recommended price to sell
     */
    public static final boolean RENTABLE = true;
    
    /**
     * Method returns the value of item that implements the saleable interface.
     * Class that implements the interface should implement this method.
     @return method returns price for daily rent
     */
    public int getDailyRentPrice();
}
