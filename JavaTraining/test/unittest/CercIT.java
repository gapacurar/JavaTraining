/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class CercIT {
    
    public CercIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRaza method, of class Cerc.
     */
    @Test
    public void testGetRaza() {
        System.out.println("getRaza");
        Cerc instance = null;
        instance = new Cerc(10.0, 5.0, 6.0);
        double expResult = 10.0;
        double result = instance.getRaza();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.  
    }

    /**
     * Test of setRaza method, of class Cerc.
     */
    @Test
    public void testSetRaza() {
        System.out.println("setRaza");
        double raza = 20.0;
        Cerc instance = new Cerc(10.0, 6.0, 7.0);
        instance.setRaza(raza);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of draw method, of class Cerc.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Cerc instance = null;
        instance = new Cerc(10.0,6.0,5.0);
        instance.draw();
    }
    
}
