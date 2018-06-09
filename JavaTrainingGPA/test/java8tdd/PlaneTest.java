/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gheor
 */
public class PlaneTest {
    
    public PlaneTest() {
    }

    /**
     * Test of getDefinition method, of class Plane.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Plane instance = new Plane();
        String expResult = "figura geometrica plana";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
