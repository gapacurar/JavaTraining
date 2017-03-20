/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstpackage;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class IntegerOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = a + b;
		int prod = a * b;
                String result = a + "+" + b + "=" + sum;
		System.out.println(result);
		// implement other operations and print results!
	}
    
}
