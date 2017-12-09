/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6multithreading;

/**
 *
 * @author gheor
 */
public class TestMTT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create 2 different threads
        SayGoodMorning sgm = new SayGoodMorning();
        SayGoodBye sgb = new SayGoodBye();
        //set priorities
        sgm.setPriority(10);
        sgb.setPriority(1);
        //check status
        System.out.println("SGM status is: " + sgm.getState());
        System.out.println("SGB status is: " + sgb.getState());
        // start 2 threads
        sgm.start();
        sgb.start();
        //check status
        System.out.println("SGM status is: " + sgm.getState());
        System.out.println("SGB status is: " + sgb.getState());
        // see priorities
        System.out.println("SGM priority is: " + sgm.getPriority());
        System.out.println("SGB priority is: " + sgb.getPriority());
        
    }
    
}
