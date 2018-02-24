/*
 * Launch a process in Java
 */
package multiprocessjava7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gheor
 */
public class SayHello {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numberOfParameters = args[0];    
        int numberOfParam = Integer.parseInt(numberOfParameters);
        try (
                FileWriter fw = new FileWriter("C:\\Users\\gheor\\Desktop\\MultithreadingFile.txt")) {
                for(int param=1;param <= numberOfParam;param++){                
                        fw.append("Hello " + args[param] +"\n"); 
                // read process environment. System will deliver default variables and also variables defined by me.                
                Map<String, String> env = System.getenv();                
                String congrats = env.get("TEXT_CONGRATS");                
                String hi = env.get("TEXT_HI");                
                fw.append("ENVIRONMENT VARIABLE CONGRATS: " + congrats + "\n");                
                fw.append("ENVIRONMENT VARIABLE HI: " + hi + "\n");                
                fw.append("Hello (to arguments): " + args[param] + "\n");                
                System.out.println("ENVIRONMENT VARIABLE CONGRATS: " + congrats);                
                System.out.println("ENVIRONMENT VARIABLE HI: " + hi);                
                System.out.println("MAIN METHOD ARGUMENT: " + args[param]);            
            }
        }        
        catch (IOException ex) {            
            Logger.getLogger(SayHello.class.getName()).log(Level.SEVERE, "File could not be open", ex);        
        } 
    }
}
