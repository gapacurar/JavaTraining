/*
 * Class Beta
 */
package datahiding.packageone;

/**
 * Class Beta
 * @author gheor
 */
public class Beta {
    
    public void testAlpha(){
    
        Alpha alphaObject = new Alpha();
        
        alphaObject.publicAttribute = 2;
        alphaObject.protectedAttribute = 3;
        //alphaObject.privateAttribute = 4;
        alphaObject.packageAttribute = 5;
    }
}
