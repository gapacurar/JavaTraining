/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posum;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class Scadere extends Thread{
    
    Counter contor;
    
    public Scadere(Counter contorFromTest){
        contor = contorFromTest;
    }
    
    @Override
    public  synchronized void run(){
        for(int i=0;i<500;i++){
            int temp = contor.getContor();
            temp --;
            contor.setContor(temp);
        }
    }
    
}
