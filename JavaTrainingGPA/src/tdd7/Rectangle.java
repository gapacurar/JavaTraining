/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd7;

/**
 *
 * @author gheor
 */
public class Rectangle extends GeometricalFigure implements Plane{
    private final String definition = "with four straight sides and four right angles, especially one with unequal adjacent sides, in contrast to a square.";

    /**
     *
     * @return definition of rectangle
     */
    @Override
    public String getDefinition(){
        String response = "RECTANGLE: "+
                        Plane.definition + " " +
                        super.getDefinition()+ " " +
                        definition;
        return response;
    }
}
