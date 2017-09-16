/*
 * TComputer frame
 */
package computer;

/**
 * Calculator frame
 * @author gheor
 */
public class Calculator {
    
    private Screen ecran;

    public Calculator() {
        this.ecran = new Screen();
    }
    
    
    /**
     * Methods adds 2 digits introduced by the user from keyboard
     */
    public void add(){
    
    }
    /**
     * Methods substracts 2 digits introduced by the user
     */
    public void descrease(){
    
    }
    /**
     * Multiply two numbers introduced by the user
     */
    public void multiply(){
    
    }
    /**
     * Divides two numbers introduced by the user
     */
    public void divide(){
    
    }
    /**
     * Starts the computer - display 0 on the Screen
     */
    public void start(){
        ecran.display("0");
    }
}
