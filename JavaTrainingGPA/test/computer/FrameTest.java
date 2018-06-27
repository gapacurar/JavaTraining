/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gheor
 */
public class FrameTest {
    
    public FrameTest() {
    }

    /**
     * Test of start method, of class Frame.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Frame instance = new Frame();
        instance.start();
        int valAfisat = instance.getEcran().getDisplayValue();
        assertEquals(0, valAfisat);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Test of pushButtonsForOperand method, of class Frame.
     */
    @Test
    public void testPushButtonsForOperand() {
        System.out.println("pushButtonsForOperand");
        Frame instance = new Frame();
        instance.pushButtonsForOperand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pushButtonsForOperator method, of class Frame.
     */
    @Test
    public void testPushButtonsForOperator() {
        System.out.println("pushButtonsForOperator");
        Frame instance = new Frame();
        instance.pushButtonsForOperator();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pushButtonEqual method, of class Frame.
     */
    @Test
    public void testPushButtonEqual() {
        System.out.println("pushButtonEqual");
        Frame instance = new Frame();
        instance.pushButtonEqual();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEcran method, of class Frame.
     */
    @Test
    public void testGetEcran() {
        System.out.println("getEcran");
        Frame instance = new Frame();
        Screen expResult = null;
        Screen result = instance.getEcran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEcran method, of class Frame.
     */
    @Test
    public void testSetEcran() {
        System.out.println("setEcran");
        Screen ecran = null;
        Frame instance = new Frame();
        instance.setEcran(ecran);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButoane method, of class Frame.
     */
    @Test
    public void testGetButoane() {
        System.out.println("getButoane");
        Frame instance = new Frame();
        Button[] expResult = null;
        Button[] result = instance.getButoane();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButoane method, of class Frame.
     */
    @Test
    public void testSetButoane() {
        System.out.println("setButoane");
        Button[] butoane = null;
        Frame instance = new Frame();
        instance.setButoane(butoane);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProcesor method, of class Frame.
     */
    @Test
    public void testGetProcesor() {
        System.out.println("getProcesor");
        Frame instance = new Frame();
        Processor expResult = null;
        Processor result = instance.getProcesor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProcesor method, of class Frame.
     */
    @Test
    public void testSetProcesor() {
        System.out.println("setProcesor");
        Processor procesor = null;
        Frame instance = new Frame();
        instance.setProcesor(procesor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
