/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatoroop;

/**
 *
 * @author gheor
 */
public class CalculatorOOP {

        private static Screen screen = new Screen();

    /**
     * Get the value of screen
     *
     * @return the value of screen
     */
    public Screen getScreen() {
        return screen;
    }

    /**
     * Set the value of screen
     *
     * @param screen new value of screen
     */
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // run the computer
        screen.clear();
        // read first operand on a line (enter confirms the number is ready)
        screen.displayMessage("Please insert first line containing your first integer");
        //....
        // read operation
        screen.displayMessage("Please introduce your operation");
        //...
        // read second operand on a line (enter confirms the number is ready)
        screen.displayMessage("Please insert next line containing your first integer");
        //....
        // please push =
        screen.displayMessage("Please introduce =");
        //...
        
    }
    
}
