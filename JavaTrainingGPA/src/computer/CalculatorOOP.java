/*
 * OO Computer program
 */
package computer;

/**
 * OO computer program
 * @author gheor
 */
public class CalculatorOOP {

    /** Computer is in fact a Frame and a lot of other components
     mounted into this frame*/
    static Frame calculator = new Frame();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // run the computer
        calculator.start();
        // read first operand on a line (enter confirms the number is ready)
        calculator.displayMessageOnScreen("Please insert first operand:");
        // read first operand
        calculator.pushButtonsForOperand();
        // read operator
        calculator.displayMessageOnScreen("Please insert operator:");
        // read operation
        calculator.pushButtonsForOperator();
        // read second operand on a line (enter confirms the number is ready)
        calculator.displayMessageOnScreen("Please insert second operand:");
        // read second operand on a line (enter confirms the number is ready)
        calculator.pushButtonsForOperand();
        // simulate pushing = and computes the result
        calculator.pushButtonEqual();        
    }
    
}
