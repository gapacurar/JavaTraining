/*
 * a-sti.ro
 */
package exceptionsinjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class ExampleExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExampleExceptions.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            throw new NumberFormatException("number format exception is here");
            //aruncExceptie(2);
            
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }        
        catch(IllegalArgumentException ex){
            ex.printStackTrace();
        }

    }
    
    /**
     *
     * @param cucu
     * cucu este cine este si stie el ce face
     */
    public static void aruncExceptie(int cucu) throws IllegalArgumentException{
    
        throw new IllegalArgumentException("cucu should not be null");
    
    }
    
}
