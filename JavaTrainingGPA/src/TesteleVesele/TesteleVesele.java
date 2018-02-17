/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteleVesele;

/**
 *
 * @author gheor
 */
public class TesteleVesele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Did Hannah see bees? Hannah did.".length());
        try{
            pseudoException();
            generateException();
            System.out.println("Codul de dupa metoda generateException()");
        } catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        } finally{
            System.out.println("Codul de dupa metoda generateException() din finally");
        }
        System.out.println("Did Hannah see bees? Hannah did.".length());
        
    }
    
    // private static void generateException();
    private static void generateException()throws ArithmeticException{
            int i = 100;
            int j = 0;
            int k = i/j;
    }
    
    //private 
    private static void pseudoException() throws ArithmeticException{
    
        ArithmeticException pseudoException = new ArithmeticException("Tzeapa! Este pseudo exceptie a la Pacurar!");
        throw(pseudoException);
    }
}
