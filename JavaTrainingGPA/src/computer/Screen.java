/*
 * This is the screen of OO Computer. It has an
 * internal memory that keeps the string of symbols
 * that is display on the screen.
 */
package computer;

/**
 * This is the screen of OO Computer. It has an
 * internal memory that keeps the string of symbols
 * that is display on the screen.
 * @author gheor
 */
public class Screen {
    
        private int displayValue = 0;

    /**
     Method display specified parameter value
     * @param valueToDisplay
     */
        public void display(int valueToDisplay){
            System.out.println(valueToDisplay);
            displayValue = valueToDisplay;
        }
    /**
     Method display 0 on the screen.
     */
        public void clear(){
            System.out.println(0);
            displayValue = 0;
        }
        /**
     * Get the value of displayValue
     *
     * @return the value of displayValue
     */
    public int getDisplayValue() {
        return displayValue;
    }

    /**
     * Set the value of displayValue
     *
     * @param valoareAfisata new value of displayValue
     */
    public void setDisplayValue(int valoareAfisata) {
        this.displayValue = valoareAfisata;
    }

    public void displayMessage(String message){
    
        System.out.println(message);
    }
}
