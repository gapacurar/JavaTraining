/*
 * Button class
 */
package calculatoroop;

/**
 * Class button
 * @author gheor
 */
public class Button {

    private Character markup;
    
    /**Pushing a button is in fact returning the markup from butto
     * @return markup from button*/
    public Character pushButton() {
        return markup;
    }

    /**
     * Marking the button with the button
     * @param markup to be printed on the button
     */
    public void drawOnButton(Character markup) {
        this.markup = markup;
    }



}
