/*
 * a-sti.ro 
*/
// we keep all class definitions togheter in same .jar archives named packages
// a package is in fact a directory on the disk
package javatraining;
// we need some external package to be imported
 /**
 * @author gheorgheaurelpacurar
 * @version 1.0
 */
public class HelloWorldForJava {
    /**
     * Method main is the point of entrance in any Java Program. 
     * Main is a must. We can have only one main method for one
     * Java application!
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tis is a way to make a comment on a line
        /*
            This is how we create comments on multiple lines
        */
        /**
         * This comment will be included in JavaDoc.
         */
        System.out.println("Hello world from Java! This is my first class!");
    }// this closes main mandatory method
} // this closes the class JavaTraining