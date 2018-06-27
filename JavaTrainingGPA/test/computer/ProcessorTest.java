/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gheor
 */
public class ProcessorTest {
    
    public ProcessorTest() {
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
     * Test of getFirstOperand method, of class Processor.
     */
    @Test
    public void testGetPrimulOperand() {
        System.out.println("getPrimulOperand");
        Processor instance = new Processor();
        Double expResult = null;
        Double result = instance.getFirstOperand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstOperand method, of class Processor.
     */
    @Test
    public void testSetPrimulOperand() {
        System.out.println("setPrimulOperand");
        Double primulOperand = null;
        Processor instance = new Processor();
        instance.setFirstOperand(primulOperand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSecondOperand method, of class Processor.
     */
    @Test
    public void testGetAlDoileaOperand() {
        System.out.println("getAlDoileaOperand");
        Processor instance = new Processor();
        Double expResult = null;
        Double result = instance.getSecondOperand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecondOperand method, of class Processor.
     */
    @Test
    public void testSetAlDoileaOperand() {
        System.out.println("setAlDoileaOperand");
        Double alDoileaOperand = null;
        Processor instance = new Processor();
        instance.setSecondOperand(alDoileaOperand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperator method, of class Processor.
     */
    @Test
    public void testGetOperator() {
        System.out.println("getOperator");
        Processor instance = new Processor();
        Character expResult = '+';
        instance.setOperator(expResult);
        Character result = instance.getOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperator method, of class Processor.
     */
    @Test
    public void testSetOperator() {
        System.out.println("setOperator");
        Character operator = '-';
        Processor instance = new Processor();
        instance.setOperator(operator);
        Character result=instance.getOperator();
        assertEquals(operator, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compute method, of class Processor.
     */
    @Test
    public void testCalculeaza() {
        System.out.println("calculeaza");
        Processor instance = new Processor();
        Double expResult = null;
        Double result = instance.compute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
