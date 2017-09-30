/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visibility.packageOne;

/**
 *
 * @author gheor
 */
public class Alpha {
    
    private int privateVarA = 10;
    protected int protectedVarA = 20;
    int packageVarA = 30;
    public int publicVarA = 40;
    
    public void testInternVariables(){
        System.out.println("Visibility of private var.:" + privateVarA);
        System.out.println("Visibility of protected var.:" + protectedVarA);
        System.out.println("Visibility of package var.:" + packageVarA);
        System.out.println("Visibility of public var.:" + publicVarA);
    }
    
}
