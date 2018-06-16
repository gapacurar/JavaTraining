/*
 * Class SalutLume is a thread
 */
package multithreadingjava8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gheor
 */
public class SalutLume extends Thread{
        @Override
    public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SalutLume.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.out.println("Salut lume!");
    }
}
