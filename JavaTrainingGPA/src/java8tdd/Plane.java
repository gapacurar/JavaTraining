/*
 * Class Plane, the mother of all plane figures
 */
package java8tdd;

/**
 * Class Plane, the mother of all plane figures
 * @author gheor
 */
public class Plane extends Shape{
    
    String definition;
    
    //constructor
    public Plane(){
        definition = super.getDefinition()+" plana";
    }
    
    // return definition

    /**
     * Returns definition composed from Shape definition and 
     * definition specific of Plane.
     * 
     * @return complete definition
     */
    @Override
    protected String getDefinition(){
        return definition;
    }
}
