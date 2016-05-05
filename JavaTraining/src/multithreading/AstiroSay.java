/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.Map;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class AstiroSay {
    
    public static void main(String[] args){
        String numberOfParameters = args[0];
        int numberOfParam = Integer.parseInt(numberOfParameters);
        for(int param=1;param <= numberOfParam;param++)
            System.out.println("Hello " + args[param]);
    }
}
