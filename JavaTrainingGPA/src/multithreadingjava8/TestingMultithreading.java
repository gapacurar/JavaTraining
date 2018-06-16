/*
 * Testing multithreading
 */
package multithreadingjava8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Testing multithreading
 * @author gheor
 */
public class TestingMultithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread hw = new HelloWorld();
        Thread sl = new SalutLume();
        
        hw.start();
        sl.start();
        

        //see priorities of threads
        System.out.println("Prioritate HelloWorld thread:"+hw.getPriority());
        System.out.println("Prioritate SalutLume thread:"+sl.getPriority());
        //
        System.out.println("HelloWorld ID="+hw.getId());
        System.out.println("SalutLume ID="+sl.getId());
        //
        //
        System.out.println("State of HelloWorld is "+hw.getState());
        System.out.println("State of SalutLume is "+sl.getState());
    }
    
}
