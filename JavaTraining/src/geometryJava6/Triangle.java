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

public class Triangle extends Flat implements Defineable{
    
    String definition = "determinata de trei puncte necoliniare.";

    @Override
    public String getDefinition() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String parentDefinition = super.definition;
        String granpaDefinition = super.getParentDefinition();
        String finalDefinition = granpaDefinition + parentDefinition + definition;
        return finalDefinition;
    }
}
