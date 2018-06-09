/*
 * Class Circle that returns definition of Circle
 */
package java8tdd;

/**
 * Class Circle that returns definition of Circle
 * @author gheor
 */
public class Circle extends Plane{
    
    private String definition;
    
    //constructor that builds complete definition of Circle
    public Circle(){
         definition = super.getDefinition()+" whose boundary (the circumference) consists of points equidistant from a fixed point (the centre";
    }
    
    //returns definition of Circle
    public String getDefinition(){
        return  definition;
    }
}
