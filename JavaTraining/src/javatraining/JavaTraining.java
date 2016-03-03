/*
 * This is a package created to keep all Java Trainings examples of code.
 * We'll create a separate branch for each training session.
 */
package javatraining;
 /**
 *
 * @author gheorgheaurelpacurar
 * @version 1.0
 *
 */
public class JavaTraining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        display();
        // work with inline arguments of main method
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = 5;
        System.out.println("Result is: "+(a+b+c));
        // create an instance of new created type named Car and call few methods
        // of class or implemented from interfaces
        Car automobile = new Car();
        short speed = 100;
        System.out.println("Actual speed of car is: "+ automobile.getSpeed());
        automobile.increaseSpeed(speed);
        System.out.println("New speed of car is: "+ automobile.getSpeed());
        System.out.println("This car is saleable? " + automobile.SALEABLE);
        System.out.println("This car is saleable? " + automobile.RENTABLE);
        System.out.println("Sale price is: " + automobile.getSalePrice());
        System.out.println("Daily rental price is: " + automobile.getDailyRentPrice());
    }
    /**
     Method displays few text messages.
     */
    public static void display(){
    
        System.out.println("-----------------------------------------");
        System.out.println("This is just a small example ");
        System.out.println("after cloning an existing GitHub Repository and ");
        System.out.println("create a new project from ");
        System.out.println("this existing one having the name Java Training :)");
        System.out.println("-----------------------------------------");
    }
  

}
