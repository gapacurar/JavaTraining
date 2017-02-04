/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtesting;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class PatratIT {
    
    public PatratIT() {
    }

    /**
     * Test of getLatura method, of class Patrat.
     */
    @Test
    public void testGetLatura() {
        System.out.println("getLatura");
        Patrat instance = new Patrat();
        int expResult = 0;
        int result = instance.getLatura();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLatura method, of class Patrat.
     */
    @Test
    public void testSetLatura() {
        System.out.println("setLatura");
        int latura = 10;
        Patrat instance = new Patrat();
        instance.setLatura(latura);
        int result = instance.getLatura();
        assertEquals(latura, result);
    }

    /**
     * Test of getSurface method, of class Patrat.
     */
    @Test
    public void testGetSurface() {
        System.out.println("getSurface");
        Patrat instance = new Patrat();
        instance.setLatura(10);
        int expResult = 100;
        int result = instance.getSurface();
        assertEquals(expResult, result);
    }
    
}
