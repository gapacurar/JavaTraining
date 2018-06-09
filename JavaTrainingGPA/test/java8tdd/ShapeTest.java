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
public class ShapeTest {
    
    public ShapeTest() {
    }

    /**
     * Test of getDefinition method, of class Shape.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Shape instance = new Shape();
        String expResult = "figura geometrica";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
