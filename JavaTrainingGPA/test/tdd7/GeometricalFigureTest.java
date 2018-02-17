/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd7;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gheor
 */
public class GeometricalFigureTest {
    
    public GeometricalFigureTest() {
    }

    /**
     * Test of getDefinition method, of class GeometricalFigure.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        GeometricalFigure instance = new GeometricalFigure();
        String expResult = "figure";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
