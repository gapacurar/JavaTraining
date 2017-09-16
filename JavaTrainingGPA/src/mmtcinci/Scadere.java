/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmtcinci;

/**
 *
 * @author gheor
 */
public class Scadere extends Thread{
        
    private Counter contorLocalB;
    
    public Scadere(Counter cBasis){
        contorLocalB = cBasis;
    }
    
    @Override
    public void run(){
        for(int i=0;i<500;i++){
            contorLocalB.decrement();
            System.out.println("Valoare contor="+contorLocalB.value());
        }
    }
}
