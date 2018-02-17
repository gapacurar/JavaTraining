/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gheor
 */
public class CarTest {
    
    public CarTest() {
    }

    /**
     * Test of setRentingPrice method, of class Car.
     */
    @Test
    public void testSetRentingPrice() {
        System.out.println("setRentingPrice");
        double rentingPrice = 100.0;
        Car instance = new Car(Car.Marca.MERCEDES,Car.Culoare.BLACK,230,460,50000);
        instance.setRentingPrice(rentingPrice);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        assertEquals(rentingPrice, instance.getDailyRentingPrice(),0.0);
    }

    /**
     * Test of setSalesPrice method, of class Car.
     */
    @Test
    public void testSetSalesPrice() {
        System.out.println("setSalesPrice");
        double salesPrice = 0.0;
        Car instance = null;
        instance.setSalesPrice(salesPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalesPrice method, of class Car.
     */
    @Test
    public void testGetSalesPrice() {
        System.out.println("getSalesPrice");
        Car instance = null;
        double expResult = 0.0;
        double result = instance.getSalesPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDailyRentingPrice method, of class Car.
     */
    @Test
    public void testGetDailyRentingPrice() {
        System.out.println("getDailyRentingPrice");
        Car instance = null;
        double expResult = 0.0;
        double result = instance.getDailyRentingPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
