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
public class Screen {
    
        private int valoareAfisata = 0;

    /**
     Method display specified parameter value
     */
        public void display(int valueToDisplay){
            System.out.println(valueToDisplay);
            valoareAfisata = valueToDisplay;
        }
    /**
     Method display specified parameter value
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

    public void displayMessage(String message){
    
        System.out.println(message);
    }
    
}
