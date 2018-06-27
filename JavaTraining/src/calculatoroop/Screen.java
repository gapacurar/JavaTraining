/*
 * OO computer screen
 */
package calculatoroop;

/**
 * OO computer Screen has the function to display one or more symbols
 * on it keeping the string of symbols on the screen in a local
 * memory.
 * @author gheor
 */
public class Screen {
    
        private int valoareAfisata = 0;

    /**
     Method display specified parameter value
     * @param valueToDisplay
     */
        public void display(int valueToDisplay){
            System.out.println(valueToDisplay);
            valoareAfisata = valueToDisplay;
        }
    /**
     Method clear the screen and display 0
     */
        public void clear(){
            System.out.println(0);
            valoareAfisata = 0;
        }
        /**
     * Get the value of valoareAfisata
     *
     * @return the value of valoareAfisata
     */
    public int getValoareAfisata() {
        return valoareAfisata;
    }

    /**
     * Set the value of valoareAfisata
     *
     * @param valoareAfisata new value of valoareAfisata
     */
    public void setValoareAfisata(int valoareAfisata) {
        this.valoareAfisata = valoareAfisata;
    }
    
    /**
     * Method display specified string on the screen.
     * String is also saved in the memory of screen.
     * @param message 
     */
    public void displayMessage(String message){
    
        System.out.println(message);
    }
    
}
