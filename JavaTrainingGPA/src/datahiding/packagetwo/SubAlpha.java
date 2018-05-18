/*
 * SubAlpha extends Alpha
 */
package datahiding.packagetwo;

import datahiding.packageone.Alpha;

/**
 * SubAlpha extends Alpha
 * @author gheor
 */
public class SubAlpha extends Alpha{
    
    public void testParentFromOtherPackage(){
    
        super.publicAttribute = 44;
        super.protectedAttribute = 45;
        //super.privateAttribute = 46;
        //super.packageAttribute = 47;
        
    }
}
