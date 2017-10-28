/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siruri;

/**
 *
 * @author gheor
 */
public class TestSiruri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hannah = "Did Hannah see bees? Hannah did.";
        int sizeOfHannah = hannah.length();
        System.out.println("Size of string hannah is:"+sizeOfHannah);
        char c = hannah.charAt(12);
        System.out.println("Character at position 12 is:"+c);
        c = hannah.charAt(15);
        System.out.println("Character at position 15 is:"+c);  
        String substring = "Was it a car or a cat I saw?".substring(9, 12);
        System.out.println("Substring is:"+substring);
        String hi = "Hi,";
        String mom = " mom.";
        String hello = hi+mom;
        System.out.println("Concatenated string is:"+hello);
        System.out.println("Concatenated string is:"+hi.concat(mom));
        
    }
    
}
