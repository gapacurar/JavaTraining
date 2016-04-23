/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class RectangleIT {
    
    public RectangleIT() {
    }

    /**
     * Test of getDefinitionSecond method, of class Rectangle.
     */
    @Test
    public void testGetDefinitionSecond() {
        System.out.println("getDefinitionSecond");
        Rectangle instance = new Rectangle();
        String expResult = "";
        String result = instance.getDefinitionSecond();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDefinitionSecond method, of class Rectangle.
     */
    @Test
    public void testSetDefinitionSecond() {
        System.out.println("setDefinitionSecond");
        String definitionSecond = "";
        Rectangle instance = new Rectangle();
        instance.setDefinitionSecond(definitionSecond);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefinitionFirst method, of class Rectangle.
     */
    @Test
    public void testGetDefinitionFirst() {
        System.out.println("getDefinitionFirst");
        Rectangle instance = new Rectangle();
        String expResult = "";
        String result = instance.getDefinitionFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDefinitionFirst method, of class Rectangle.
     */
    @Test
    public void testSetDefinitionFirst() {
        System.out.println("setDefinitionFirst");
        String definition = "";
        Rectangle instance = new Rectangle();
        instance.setDefinitionFirst(definition);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefinition method, of class Rectangle.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Rectangle instance = new Rectangle();
        String expResult = "RECTANGLE:  is a Geometrical figure 2D with four straight sides and four right angles , especially one with unequal adjacent sides , in contrast to a square.";
        String result = instance.getDefinition();
        assertEquals("The test case is a prototype.", expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
