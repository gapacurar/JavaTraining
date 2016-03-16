/*
 * copyright a-sti.ro
 */
package javatraining;

/**
 *
 * @author gheorgheaurelpacurar
 * Generic class, generic method 
 * @param <T> generic type
 */
public class Box<T> {
    /** 
     private field t having generic type T
     */
    private T t;          
    /**
     set-er for t private filed of Box class
     * @param t paramater
     */
    public void set(T t) {
        this.t = t;
    }
    /**
     get-er returns value of private filed t by =generic type T.
     * @return t
     */
    public T get() {
        return t;
    }
    /**
     Method prints the name of concrete types in run-time of generic types
     * U and T
     * @param <U> u generic type
     * @param u 
     */
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
    /**
     main method of class. 
     * @param args
     * @argument args 
     */
    public static void main(String[] args) {
        // create a Box for Integers
        Box<Integer> integerBox = new Box<>();
        // set value of Integer field t to 10
        integerBox.set(10);
        //integerBox.inspect("some text"); // error: this is still String!
        // call inspect method with an Integer parameter
        Integer intObject;
        intObject= 20;  
        integerBox.inspect(intObject);
        // call inspet method with a Double object
        Double doubleObject;
        doubleObject = 30.30;
        integerBox.inspect(doubleObject);
        
    }
}
