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
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = 5;
        System.out.println("Result is: "+(a+b+c));
        Car automobile = new Car();
        short speed = 100;
        System.out.println("Actual speed of car is: "+ automobile.getSpeed());
        automobile.increaseSpeed(speed);
        System.out.println("New speed of car is: "+ automobile.getSpeed());

    }
    
    public static void display(){
    
        System.out.println("-----------------------------------------");
        System.out.println("This is just a small example ");
        System.out.println("after cloning an existing GitHub Repository and ");
        System.out.println("create a new project from ");
        System.out.println("this existing one having the name Java Training :)");
        System.out.println("-----------------------------------------");
    }
  

}
