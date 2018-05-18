/*
 * Generates random numbers between 1 and 6
 */
package java8numbers;

/**
 * Generates random numbers between 1 and 6
 * @author gheor
 */
public class Zar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int counter =0;counter <100;counter++){
            short randomNumber = (short)(Math.random()*10%6+1);
            System.out.println("Random number value = "+randomNumber);
        }
    }
    
}
