/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittesting;

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
public class UserTest {
    
    public UserTest() {
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
     * Test of getFirstName method, of class User.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        User instance = new User("First Name","Middle Name","Last Name");
        String expResult = "First Name";
        String result = instance.getFirstName();
        assertEquals("The test case is a prototype.",expResult, result);
    }

    /**
     * Test of setFirstName method, of class User.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        User instance = new User("First Name","Middle Name","Last Name");
        String expResult = "First Name";
        instance.setFirstName("First Name");
        assertEquals("The test case is a prototype.",expResult, "First Name");
    }

    /**
     * Test of getMiddleName method, of class User.
     */
    @Test
    public void testGetMiddleName() {
        System.out.println("getMiddleName");
        User instance = new User("First Name","Middle Name","Last Name");
        String expResult = "Middle Name";
        String result = instance.getMiddleName();
        assertEquals("The test case is a prototype.",expResult, result);
    }

    /**
     * Test of setMiddleName method, of class User.
     */
    @Test
    public void testSetMiddleName() {
        System.out.println("setMiddelName");
        User instance = new User("First Name","Middle Name","Last Name");
        String expResult = "Middle Name";
        instance.setMiddleName("Middle Name");
        assertEquals("The test case is a prototype.",expResult, "Middle Name");
    }
    /**
     * Test of getMiddleName method, of class User.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        User instance = new User("First Name","Middle Name","Last Name");
        String expResult = "Last Name";
        String result = instance.getLastName();
        assertEquals("The test case is a prototype.",expResult, result);
    }

    /**
     * Test of setMiddleName method, of class User.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        User instance = new User("First Name","Middle Name","Last Name");
        String expResult = "Last Name";
        instance.setLastName("Last Name");
        assertEquals("The test case is a prototype.",expResult, "Last Name");
    }

    /**
     * Test of equals method, of class User.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        User obj = new User("First Name","Middle Name","Last Name");
        User instance = new User("First Name","Middle Name","Last Name");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertFalse("Instances are different. It is what we want!", expResult==result);
    }
    
}
