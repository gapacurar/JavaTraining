/*
 * Program launches two different threads
 */
package multithreadingjava7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gheor
 */
public class MttJava7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create 2 class/threads instances
        HelloWorld thread1 = new HelloWorld();
        SalutLume thread2 = new SalutLume();
        //get default priorities
        System.out.println("Prioritate thread1: "+thread1.getPriority());
        System.out.println("Prioritate thread2: "+thread2.getPriority());
        // start the threads
        thread1.start();
        try {
            // set priorities
            //thread2.setPriority(10);
            //thread1.setPriority(1);
            //set sleeping time
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MttJava7.class.getName()).log(Level.SEVERE, null, ex);
        }        
        thread2.start();
        thread2.interrupt();
        
    }
    
}
