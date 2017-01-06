/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersandstrings;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class TestStringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        
        StringBuilder sbu = new StringBuilder("0123456789");
        System.out.println(sbu.length());
        
        StringBuilder sbh = new StringBuilder("Did Hannah see bees? Hannah did!");
        System.out.println(sbh.length());
        System.out.println(sbh.charAt(12));
        System.out.println(sbh.indexOf("b"));
        System.out.println(sbh.substring(9,12));
        
        
    }
    
}
