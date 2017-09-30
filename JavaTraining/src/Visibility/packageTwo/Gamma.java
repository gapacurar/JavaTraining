/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visibility.packageTwo;

import Visibility.packageOne.Alpha;




/**
 *
 * @author gheor
 */
public class Gamma extends Alpha{
    private int privateVarG = 210;
    protected int protectedVarG = 220;
    int packageVarG = 230;
    public int publicVarG = 240;
    
    @Override
    public void testInternVariables(){
        super.testInternVariables();
        System.out.println("Visibility of private var.:" + privateVarG);
        System.out.println("Visibility of protected var.:" + protectedVarG);
        System.out.println("Visibility of package var.:" + packageVarG);
        System.out.println("Visibility of public var.:" + publicVarG);
    }
    
    public void testInheritedVariables(){
        //System.out.println("Visibility of private var.:" + privateVarA);
        System.out.println("Visibility of protected var.:" + protectedVarA);
        //System.out.println("Visibility of package var.:" + packageVarA);
        System.out.println("Visibility of public var.:" + publicVarA);
    }
    
    public void testParentVariables(){
        //System.out.println("Visibility of private var.:" + super.privateVarA);
        System.out.println("Visibility of protected var.:" + super.protectedVarA);
        //System.out.println("Visibility of package var.:" + super.packageVarA);
        System.out.println("Visibility of public var.:" + super.publicVarA);
    }
    
}
