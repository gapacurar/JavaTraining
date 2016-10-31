/*
 * Hello Ionel
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello Ionel
 * @author gheorgheaurelpacurar
 */
public class SalutIonel extends Thread{
    @Override
    public void run() {
        System.out.println("Hello Ionel!");    
        System.out.println("SalutIonel thread name is: "+this.getName());
        System.out.println("SalutIonel thread state is: "+this.getState());
        System.out.println("Ionel doarme 5 secunde");
        try {
            SalutIonel.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SalutIonel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
