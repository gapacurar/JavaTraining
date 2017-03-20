/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class Age {

    public static void main(String[] args) {
    try { 
        Scanner scanner;
        scanner = new Scanner(System.in);
        String line;
        line = scanner.nextLine();
        System.out.println(ageInMonths(Integer.parseInt(line))); 
    } catch (NumberFormatException e) { 
        System.out.println("first program argument needs to be an int"); 
    }catch (IllegalArgumentException e) { 
        System.out.println(e.getMessage()); 
        System.out.println("Please introduce a positive age :) :");
    } 
} 

static int ageInMonths(int age) { 
    if (age < 0) {
         throw new IllegalArgumentException("age should be >= 0"); 
    } 
     return age * 12; 
}
    
}
