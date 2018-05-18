/*
 * Delta the extended class of Alpha
 */
package datahiding.packageone;

/**
 * Delta the extended class of Alpha
 * @author gheor
 */
public class Delta extends Alpha{
    
    public void testParent(){
        
        //super.privateAttribute = 11;
        super.publicAttribute = 12;
        super.protectedAttribute = 13;
        super.packageAttribute = 14;
        
    }
}
