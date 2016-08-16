
package javatraining;

import java.util.Properties;

/*
 * a-sti.ro
package javatraining;
// we need some external package to be imported
import java.util.Properties;
 /**
 * @author gheorgheaurelpacurar
 * @version 1.0
 */
public class JavaTraining {
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
        display();
        // work with inline arguments of main method
        Car automobile = new Car();
        //test to see if toString() method exists for Car
        System.out.println("Testez daca exista metoda toString() si am obtinut: "+automobile.toString());
        //see what color is the car?
        System.out.println("Initial car color is: " + automobile.getColor());
        short cucubawViteza = 100;
        System.out.println("Actual speed of car is: "+ automobile.getSpeed());
        automobile.increaseSpeed(cucubawViteza);
        System.out.println("New speed of car is: "+ automobile.getSpeed());
        //
        System.out.println("This car is saleable? " + Car.SALEABLE);
        System.out.println("This car is rentable? " + Car.RENTABLE);
        int salePrice = automobile.getSalePrice();
        System.out.println("Sale price is: " + salePrice);
        int dailyRentPrice = automobile.getDailyRentPrice();
        System.out.println("Daily rental price is: " + dailyRentPrice);
        // set new color to Color.YELLOW
        automobile.setColor(Car.Color.YELLOW);
        // Increase speed to 150
        short secondSpeed = 150;
        automobile.increaseSpeed(secondSpeed);  
        // testing casting 
        Object object = new Car(); // works because of implicit casting
        // Car newCar = object; requires a casting to SubClass named Car
        Car newCar = (Car)object;
        
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
        // test inner and static classes
        OuterClass outerObject = new OuterClass();
        
        outerObject.a=10;
        outerObject.d=10;
        /*
        OuterClass.StaticNestedClass.b=10;
        OuterClass.StaticNestedClass.c=10;
        OuterClass.StaticNestedClass.getC();
        
        OuterClass.InnerClass.e=0;
        OuterClass.InnerClass.f=10;
        OuterClass.InnerClass.getF();
        */
        Properties properties = System.getProperties();
        System.out.println("Java Version:"+properties.getProperty("java.version"));
        System.out.println("Java Home:"+properties.getProperty("java.home"));
        System.out.println("Java VM vendor:"+properties.getProperty("java.vm.vendor"));
        System.out.println("OS name:"+properties.getProperty("os.name"));
        System.out.println("User name:"+properties.getProperty("user.name"));
        System.out.println("----------------------------------------------------------");
    }
  

}
