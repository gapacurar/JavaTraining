/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtesting;

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

    @Test
    public void testSomeMethod() {
        // create instance of/object of type Cerc
        Cerc c1 = new Cerc();
        // choose bolleam variable
        boolean adevaratSauFals = true;
        //test if expected value is delivered value
        if("Figura geometrica plana definita ca si loc geometric al tututor punctelor egal departate de un punct fix numit centrul cercului la distanta numita raza".equals(c1.getDefinitie()))
        //send to JUnit the result
        assertTrue(adevaratSauFals);
    }

    /**
     * Test of getRazaCercului method, of class Cerc.
     */
    @Test
    public void testGetRazaCercului() {
        System.out.println("getRazaCercului");
        Cerc instance = new Cerc();
        int expResult = 0;
        int result = instance.getRazaCercului();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRazaCercului method, of class Cerc.
     */
    @Test
    public void testSetRazaCercului() {
        System.out.println("setRazaCercului");
        int razaCercului = 10;
        Cerc instance = new Cerc();
        instance.setRazaCercului(razaCercului);
        assertTrue(10==instance.getRazaCercului());
        
    }

    /**
     * Test of getDefinitie method, of class Cerc.
     */
    @Test
    public void testGetDefinitie() {
        System.out.println("getDefinitie");
        Cerc instance = new Cerc();
        String expResult = "Figura geometrica plana definita ca si loc geometric al tututor punctelor egal departate de un punct fix numit centrul cercului la distanta numita raza";
        String result = instance.getDefinitie();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDefinitie method, of class Cerc.
     */
    @Test
    public void testSetDefinitie() {
        System.out.println("setDefinitie");
        String expResult = "Definition for test";
        Cerc instance = new Cerc();
        instance.setDefinitie(expResult);
        String result = instance.getDefinitie();
        assertEquals(expResult, result);
    }
    
}
