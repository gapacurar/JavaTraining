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
public class Adunare extends Thread{
    
    private Counter contorLocalA;
    
    public Adunare(Counter cBasis){
        contorLocalA = cBasis;
    }
    
    @Override
    public void run(){
        for(int i=0;i<500;i++){
            contorLocalA.increment();
            System.out.println("Valoare contor="+contorLocalA.value());
        }
    }
}