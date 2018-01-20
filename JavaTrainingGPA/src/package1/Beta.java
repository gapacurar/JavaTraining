/*
 * Class Beta
 */
package package1;

/**
 *
 * @author gheor
 */
public class Beta {
    
    public void testA(){
        Alpha obiectDeTipA = new Alpha();
        System.out.println("=== clasa Beta din acelasi pachet cu Alpha ===");
        System.out.println("Variabila publica din clasa Alpha este: "+ obiectDeTipA.publicA);
        System.out.println("Variabila package din clasa Alpha este: "+ obiectDeTipA.packageA);
        System.out.println("Variabila protected din clasa Alpha este: "+ obiectDeTipA.protectedA);
        System.out.println("Variabila private din clasa Alpha NU este visibila. ");
    }
}
