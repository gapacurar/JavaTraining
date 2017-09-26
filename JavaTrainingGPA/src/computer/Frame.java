/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import java.util.Scanner;

/**
 *
 * @author gheor
 */
public class Frame {
    
    private Screen ecran;
    private Button[] butoane;
    private Character markupsOfButtons[] = {'0','1','2','3','4','5','6','7','8','9','+','-','*','/','='};
    private Processor procesor;

    public Frame() {
        ecran = new Screen();
        procesor = new Processor();
        butoane =  new Button[15];
        int i = 0;
        for(Character currentMarkup:markupsOfButtons){
            Button newButton = new Button();
            newButton.drawOnButton(currentMarkup);
            butoane[i] = newButton;
            i++;
        }
    }
    
    public void start(){
        ecran.display(0);
    }
    
    public void displayMessageOnScreen(String message){
        ecran.displayMessage(message);
    }
    
    public void pushButtonsForOperand(){
        Scanner newScanner = new Scanner(System.in);
        String readit = newScanner.nextLine();
        Double operand = Double.valueOf(readit);
        ecran.displayMessage("You introduced operand: ");
        ecran.displayMessage(readit);
        if(procesor.getPrimulOperand() == null)
            procesor.setPrimulOperand(operand);
        else
            procesor.setAlDoileaOperand(operand); 
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
        Double result = procesor.calculeaza();
        ecran.displayMessage(result.toString());
    }
    
    public Screen getEcran() {
        return ecran;
    }

    public void setEcran(Screen ecran) {
        this.ecran = ecran;
    }

    public Button[] getButoane() {
        return butoane;
    }

    public void setButoane(Button[] butoane) {
        this.butoane = butoane;
    }

    public Processor getProcesor() {
        return procesor;
    }

    public void setProcesor(Processor procesor) {
        this.procesor = procesor;
    }
    
    
    
    
}
