/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class BoxIT {
    
    public BoxIT() {
    }

    /**
     * Test of set method, of class Box.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        Integer t = 7;
        Box instance = new Box();
        instance.set(t);
        Integer expResult = (Integer)instance.get();
        // TODO review the generated test code and remove the default call to fail.
        //fail("Cucu baw.");
        assertEquals(expResult, t);
    }

    /**
     * Test of get method, of class Box.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Box instance = new Box();
        instance.set(223);
        Object expResult = 223;
        Object result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Cucu baw.");
    }

    /**
     * Test of inspect method, of class Box.
     */
    @Test
    public void testInspect() {
        System.out.println("inspect");
        Integer t = 232;
        Number u = 333;
        Box instance = new Box();
        instance.set(t);
        instance.inspect(u);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
