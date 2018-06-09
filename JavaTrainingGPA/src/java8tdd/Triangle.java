/*
 * Class Triangle that returns the definition of Triangle
 */
package java8tdd;

/**
 * Class Triangle that returns the definition of Triangle
 * @author gheor
 */
public class Triangle extends Plane{
    
    private String definition;
    
    // constructor of rectangle that builds complete definition
    
    public Triangle(){
        definition = super.getDefinition() + " with three straight sides and three angles.";
    }
    
    // returns definition of Triangle
    @Override
    public String getDefinition(){
        return definition;
    }
    
}
