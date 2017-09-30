/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryJava6;

/**
 *
 * @author gheor
 */
public class TestDefinitions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Line newLine = new Line();
        System.out.println("Definitie linie = " + newLine.getDefinition());
        
        Triangle newTriangle = new Triangle();
        System.out.println("Definitie triunghi = " + newTriangle.getDefinition());
    }
    
}
