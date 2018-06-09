/*
 * Program returns the list of definition for a specified collection of figures
 */
package java8tdd;

import java.util.Iterator;
import java.util.LinkedList;
import jdk.nashorn.internal.objects.NativeArray;

/**
 * Program returns the list of definition for a specified collection of figures
 * @author gheor
 */
public class ListOfDefinitions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a list of shapes
        LinkedList<Shape> listOfShapes = new LinkedList<>();
        // create concrete Shapes
        Rectangle dr1 = new Rectangle();
        Rectangle dr2 = new Rectangle();
        Circle c = new Circle();
        Triangle tr1 = new Triangle();
        Triangle tr2 = new Triangle();
        Square s = new Square();
        //add concrete Shapes in the list
        listOfShapes.add(dr1);
        listOfShapes.add(dr2);
        listOfShapes.add(c);
        listOfShapes.add(tr1);
        listOfShapes.add(tr2);
        listOfShapes.add(s);
        // go to all elements in the list and print definitions
        for (Shape curentShape : listOfShapes) {
            System.out.println(curentShape.getDefinition());
        }
        
    }
    
}
