/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author gheor
 */
public class CalculatorOOP {

    static Frame calculator = new Frame();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // run the computer
        calculator.start();
        // read first operand on a line (enter confirms the number is ready)
        calculator.displayMessageOnScreen("Please insert your first operand:");
        // read first operand
        calculator.pushButtonsForOperand();
        // read operator
        calculator.displayMessageOnScreen("Please insert your first operator:");
        // read operation
        calculator.pushButtonsForOperator();
        // read second operand on a line (enter confirms the number is ready)
        calculator.displayMessageOnScreen("Please insert your second operand:");
        // read second operand on a line (enter confirms the number is ready)
        calculator.pushButtonsForOperand();
        // read first operand on a line (enter confirms the number is ready)
        calculator.displayMessageOnScreen("Please insert =:");
        // please push =
        calculator.pushButtonEqual();        
    }
    
}
