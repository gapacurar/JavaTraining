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
public class Circle extends GeometricalFigure implements Plane{
    
    private final String definition = "whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).";

    /**
     *
     * @return definition of Circle
     */
    @Override
    public String getDefinition(){
        String response = "CIRCLE: "+
                Plane.definition+
                " "+
                super.getDefinition()+
                " "+
                definition;
        return response;
    }
}
