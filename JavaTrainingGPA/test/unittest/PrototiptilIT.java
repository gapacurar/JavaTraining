/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class PrototiptilIT {
    
    public PrototiptilIT() {
    }

    /**
     * Test of getProto method, of class Prototiptil.
     */
    @Test
    public void testGetProto() {
        System.out.println("getProto");
        Prototiptil instance = new Prototiptil();
        int expResult = 10;
        int result = instance.getProto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProto method, of class Prototiptil.
     */
    @Test
    public void testSetProto() {
        System.out.println("setProto");
        int proto = 0;
        Prototiptil instance = new Prototiptil();
        instance.setProto(proto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTiptilos method, of class Prototiptil.
     */
    @Test
    public void testGetTiptilos() {
        System.out.println("getTiptilos");
        Prototiptil instance = new Prototiptil();
        String expResult = "Initial String";
        String result = instance.getTiptilos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTiptilos method, of class Prototiptil.
     */
    @Test
    public void testSetTiptilos() {
        System.out.println("setTiptilos");
        String result = "CucuBaw";
        Prototiptil instance = new Prototiptil();
        instance.setTiptilos(result);
        String expResult = "CucuBaw";
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrototiptilos method, of class Prototiptil.
     */
    @Test
    public void testGetPrototiptilos() {
        System.out.println("getPrototiptilos");
        Prototiptil instance = new Prototiptil();
        String expResult = "10Initial String";
        String result = instance.getPrototiptilos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
