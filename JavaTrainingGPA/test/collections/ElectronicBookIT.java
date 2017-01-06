/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

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
public class ElectronicBookIT {
    
    public ElectronicBookIT() {
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
     * Test of getISBN method, of class ElectronicBook.
     */
    @Test
    public void testGetISBN() {
        System.out.println("getISBN");
        ElectronicBook instance = new ElectronicBook("ISBN Test",new String[]{"John Doe","Jane Doe"});
        String expResult = "ISBN Test";
        String result = instance.getISBN();
        assertEquals("The test case is a prototype.", expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setISBN method, of class ElectronicBook.
     */
    @Test
    public void testSetISBN() {
        System.out.println("setISBN");
        String expected = "ISBN Test";
        ElectronicBook instance = new ElectronicBook("p",new String[]{"John Doe","Jane Doe"});
        instance.setISBN("ISBN Test");
        String result = instance.getISBN();
        assertEquals("The test case is a prototype.", expected, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthors method, of class ElectronicBook.
     */
    @Test
    public void testGetAuthors() {
        System.out.println("getAuthors");
        ElectronicBook instance = null;
        String[] expResult = null;
        String[] result = instance.getAuthors();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthors method, of class ElectronicBook.
     */
    @Test
    public void testSetAuthors() {
        System.out.println("setAuthors");
        String[] authors = null;
        ElectronicBook instance = null;
        instance.setAuthors(authors);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDownloadLinks method, of class ElectronicBook.
     */
    @Test
    public void testGetDownloadLinks() {
        System.out.println("getDownloadLinks");
        ElectronicBook instance = null;
        String[] expResult = null;
        String[] result = instance.getDownloadLinks();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDownloadLinks method, of class ElectronicBook.
     */
    @Test
    public void testSetDownloadLinks() {
        System.out.println("setDownloadLinks");
        String[] downloadLinks = null;
        ElectronicBook instance = null;
        instance.setDownloadLinks(downloadLinks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRemarksAndNotes method, of class ElectronicBook.
     */
    @Test
    public void testGetRemarksAndNotes() {
        System.out.println("getRemarksAndNotes");
        ElectronicBook instance = null;
        String[] expResult = null;
        String[] result = instance.getRemarksAndNotes();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRemarksAndNotes method, of class ElectronicBook.
     */
    @Test
    public void testSetRemarksAndNotes() {
        System.out.println("setRemarksAndNotes");
        String[] remarksAndNotes = null;
        ElectronicBook instance = null;
        instance.setRemarksAndNotes(remarksAndNotes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPublisher method, of class ElectronicBook.
     */
    @Test
    public void testGetPublisher() {
        System.out.println("getPublisher");
        ElectronicBook instance = null;
        String expResult = "";
        String result = instance.getPublisher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPublisher method, of class ElectronicBook.
     */
    @Test
    public void testSetPublisher() {
        System.out.println("setPublisher");
        String publisher = "";
        ElectronicBook instance = null;
        instance.setPublisher(publisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class ElectronicBook.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ElectronicBook instance = null;
        float expResult = 0.0F;
        float result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class ElectronicBook.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        float price = 0.0F;
        ElectronicBook instance = null;
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElectronicFormat method, of class ElectronicBook.
     */
    @Test
    public void testGetElectronicFormat() {
        System.out.println("getElectronicFormat");
        ElectronicBook instance = null;
        ElectronicBook.FormatOfElectronicBook expResult = null;
        ElectronicBook.FormatOfElectronicBook result = instance.getElectronicFormat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setElectronicFormat method, of class ElectronicBook.
     */
    @Test
    public void testSetElectronicFormat() {
        System.out.println("setElectronicFormat");
        ElectronicBook.FormatOfElectronicBook electronicFormat = null;
        ElectronicBook instance = null;
        instance.setElectronicFormat(electronicFormat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYearOfPublication method, of class ElectronicBook.
     */
    @Test
    public void testGetYearOfPublication() {
        System.out.println("getYearOfPublication");
        ElectronicBook instance = null;
        ElectronicBook.YearOfPublication expResult = null;
        ElectronicBook.YearOfPublication result = instance.getYearOfPublication();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYearOfPublication method, of class ElectronicBook.
     */
    @Test
    public void testSetYearOfPublication() {
        System.out.println("setYearOfPublication");
        ElectronicBook.YearOfPublication yearOfPublication = null;
        ElectronicBook instance = null;
        instance.setYearOfPublication(yearOfPublication);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class ElectronicBook.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        ElectronicBook instance = null;
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class ElectronicBook.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        ElectronicBook instance = null;
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
