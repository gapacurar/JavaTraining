/*
 * Copyright a-sti.ro
 */
package javatraining;
/**
 * @author gheorgheaurelpacurar
 */
public class Car implements Saleable, Rentable{
    /**
     @enum enumeration of accepted car colors
     */
    //public enum Color { WHITE, RED, YELLOW, GREEN, GRAY, BLACK };
    public static class Color { 
        public static final int WHITE =0;
        public static final int RED = 1;
        public static final int YELLOW = 2;
        public static final int GREEN = 3;
        public static final int GRAY = 4;
        public static final int BLACK = 5; 
                
    };
    /**
     Internal hidden fields / attributes
     */
    private int color;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    private String name;
    private short speed;
    /**
     Constructors
     */
    public void Car(){
        name = "Default car name";
        speed = 90;
        color = Car.Color.BLACK;
    }
    public void Car(String name, short speed, int color){
        this.name = name;
        this.speed = speed;
        if(color <= 5 && color >=0){
            this.color = color;
        } else {
            color = Car.Color.BLACK;
        }
    }
    /*get-ers and set-ers*/
    public String getName(){
        return(name);
    }
    /*
    public Color getColor(){
        return(color);
    }
    */
    public short getSpeed(){
        return(speed);
    }
    public void setName(String newName){
        name = newName;
    }
    /*
    public void setColor(Color newColor){
        color = newColor;
    }
    */
    public void setSpeed(short newSpeed){
        speed = newSpeed;
    }
    /**
     The method increase actual speed of Car until final speed specified.
     * Method tests if specified speed is higher than actual speed before to 
     * increase it.
     * @param newSpeed is new speed 
     */
    public void increaseSpeed(short newSpeed){
        if(newSpeed > speed){
            speed = newSpeed;
        }
        else if (newSpeed < speed){
            decreaseSpeed(newSpeed);
        }
    }
    /**
     The method decrease actual speed of Car until final speed specified.
     * Method tests if specified speed is higher than actual speed before to 
     * increase it.
     * @param newSpeed is new speed 
     */
    public void decreaseSpeed(short newSpeed){
        if(newSpeed < speed){
            speed = newSpeed;
        }
        else if (newSpeed < speed){
            increaseSpeed(newSpeed);
        }
    }
    /**
     Abstract method defined in Saleable interface implemented by class car
     * is implemented here.
     * @override Saleable.getSalePrice() method
     * 
     */
    //
    @Override
    public int getSalePrice(){
        return(12000);
    }
       /**
     Abstract method defined in Rentable interface implemented by class car
     * is implemented here.
     * @override Rentable.getDailyRentPrice() method
     * 
     */
    @Override
    public int getDailyRentPrice(){
        return(250);
    }
}
