/*
 * Frame of OO computer
 */
package computer;

import java.util.Scanner;

/**
 * Frame to mount all components of computer
 * @author gheor
 */
public class Frame {
    
    private Screen ecran;
    private Button[] buttons;
    private final Character markupsOfButtons[] = {'0','1','2','3','4','5','6','7','8','9','+','-','*','/','='};
    private Processor procesor;

    public Frame() {
        ecran = new Screen();
        procesor = new Processor();
        buttons =  new Button[15];
        int i = 0;
        for(Character currentMarkup:markupsOfButtons){
            Button newButton = new Button();
            newButton.drawOnButton(currentMarkup);
            buttons[i] = newButton;
            i++;
        }
    }
    /** Starts the OO computer*/
    public void start(){
        ecran.display(0);
    }
    /** Display message on scree
     * @param message
     * @param messagen*/
    public void displayMessageOnScreen(String message){
        ecran.displayMessage(message);
    }
    
    public void pushButtonsForOperand(){
        Scanner newScanner = new Scanner(System.in);
        String readit = newScanner.nextLine();
        Double operand = Double.valueOf(readit);
        ecran.displayMessage("You introduced operand: ");
        ecran.displayMessage(readit);
        if(procesor.getFirstOperand() == null)
            procesor.setFirstOperand(operand);
        else
            procesor.setSecondOperand(operand); 
    }

    public void pushButtonsForOperator(){
        Scanner newScanner = new Scanner(System.in);
        String readit = newScanner.nextLine();
        Character operand = readit.charAt(0);
        ecran.displayMessage("You introduced operand: ");
        ecran.displayMessage(operand.toString());
        procesor.setOperator(operand);
    }
    
    public void pushButtonEqual(){
        Double result = procesor.compute();
        ecran.displayMessage(result.toString());
    }
    
    public Screen getEcran() {
        return ecran;
    }

    public void setEcran(Screen ecran) {
        this.ecran = ecran;
    }

    public Button[] getButoane() {
        return buttons;
    }

    public void setButoane(Button[] butoane) {
        this.buttons = butoane;
    }

    public Processor getProcesor() {
        return procesor;
    }

    public void setProcesor(Processor procesor) {
        this.procesor = procesor;
    }
    
    
    
    
}
