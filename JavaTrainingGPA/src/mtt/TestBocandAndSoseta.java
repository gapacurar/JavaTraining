/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtt;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class TestBocandAndSoseta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new Bocanc thread
        BocanculMagic bocanc = new BocanculMagic();
        BocanculMagic bocanc1 = new BocanculMagic();
        BocanculMagic bocanc2 = new BocanculMagic();

        // create a new soseta thread
        SosetaMagica soseta = new SosetaMagica();
        soseta.run();
        //see attributes of thread
       System.out.println("Bocanc Thread ID="+bocanc.getId());
       System.out.println("Bocanc1 Thread ID="+bocanc1.getId());
       System.out.println("Bocanc2 Thread ID="+bocanc2.getId());
       bocanc1.setPriority(1);
       bocanc2.setPriority(10);
       System.out.println("Bocanc Priority="+bocanc.getPriority());
       System.out.println("Bocanc1 Priority="+bocanc1.getPriority());
       System.out.println("Bocanc2 Priority="+bocanc2.getPriority());
       bocanc.start();
       bocanc1.start();
       bocanc2.start();
       System.out.println("Bocanc2 State="+bocanc2.getState());
       System.out.println("Bocanc1 State="+bocanc1.getState());
       System.out.println("Bocanc State="+bocanc.getState());

                
    }
    
}
