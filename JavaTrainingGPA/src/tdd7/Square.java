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
public class Square extends GeometricalFigure implements Plane{
    private final String definition = "with four equal straight sides and four right angles.";
    
    /**
     *
     * @return definition of square
     */
    @Override
    public String getDefinition(){
        String result = "SQUARE: "+
                Plane.definition + " "+
                super.getDefinition() + " " +
                definition;
        return result;
    }
}
