/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visibility;

import Visibility.packageOne.Alpha;
import Visibility.packageOne.Beta;
import Visibility.packageTwo.Gamma;

/**
 *
 * @author gheor
 */
public class TestVisibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alpha alphaObject = new Alpha();
        Beta betaObject = new Beta();
        Gamma gammaObject = new Gamma();
        
        System.out.println("TestVisibility Alpha class: public var:"+alphaObject.publicVarA);
        //System.out.println("TestVisibility Alpha class: protected var:"+alphaObject.protectedVarA);
        //System.out.println("TestVisibility Alpha class: private var:"+alphaObject.privateVarA);
        //System.out.println("TestVisibility Alpha class: package var:"+alphaObject.packageVarA);
        
        System.out.println("TestVisibility Alpha class: public method:alphaObject.testInternVariables()");
        alphaObject.testInternVariables();
        
        System.out.println("TestVisibility Beta class: public method:betaObject.testInheritedVariables()");
        betaObject.testInheritedVariables();
        
        System.out.println("TestVisibility Gamma class: public method:gammaObject.testInheritedVariables()");
        System.out.println("TestVisibility to Gamma members:"+gammaObject.publicVarG);
        System.out.println("TestVisibility calls gammaObject.testInheritedVariables");
        gammaObject.testInheritedVariables();
        System.out.println("TestVisibility calls gammaObject.testInternVariables");
        gammaObject.testInternVariables();
        System.out.println("TestVisibility calls gammaObject.testParentVariables");
        gammaObject.testParentVariables();
    }
    
}
