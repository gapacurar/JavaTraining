/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd7;

import java.util.LinkedList;

/**
 *
 * @author gheor
 */
public class TestDefinitions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a list of figures
        LinkedList<GeometricalFigure> listOfFigures = new LinkedList<>();
        listOfFigures.add(new Triangle());
        listOfFigures.add(new Triangle());
        listOfFigures.add(new Rectangle());
        listOfFigures.add(new Circle());
        listOfFigures.add(new Square());
        
        for (GeometricalFigure currentFigure:listOfFigures){
            System.out.println(currentFigure.getDefinition());
        }
        
    }
    
}
