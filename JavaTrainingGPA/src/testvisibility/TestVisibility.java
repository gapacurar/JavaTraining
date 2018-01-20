/*
 * Test visibility
 */
package testvisibility;

import package1.*;
import package2.*;

/**
 *
 * @author gheor
 */
public class TestVisibility {
    
    public static void main(String[] args){
        Beta b = new Beta();
        Gamma g = new Gamma();
        
        b.testA();
        g.testA();
    }
}
