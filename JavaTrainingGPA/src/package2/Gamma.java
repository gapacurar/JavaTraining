/*
 * Class Gamma
 */
package package2;

import package1.Alpha;

/**
 *
 * @author gheor
 */
public class Gamma {
    
    public void testA(){
       Alpha obiectDeTipA = new Alpha();
        System.out.println("=== clasa Gamma din alt pachet decat Alpha ===");
        System.out.println("Variabila publica din clasa Alpha este: "+ obiectDeTipA.publicA);
        System.out.println("Variabila package din clasa Alpha NU estevizibila ");
        System.out.println("Variabila protected din clasa Alpha NU este vizibila ");
        System.out.println("Variabila private din clasa Alpha NU este visibila. ");    
    }
    
}
