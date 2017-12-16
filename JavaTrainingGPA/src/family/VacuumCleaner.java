/*
 * Vacuum Cleaner
 */
package family;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gheor
 */
public class VacuumCleaner extends Thread{
    
    private Boolean isCleaning = false;

    public Boolean getIsCeaning() {
        return isCleaning;
    }

    public void setIsCeaning(Boolean isCeaning) {
        this.isCleaning = isCeaning;
    }
    
    @Override
    public void run(){
        System.out.println("VAcuum Cleaner is cleaning");
        cleaning();
    }
    
    private void cleaning(){
        if(isCleaning==true){
            try {
                Thread.sleep(MIN_PRIORITY);
            } catch (InterruptedException ex) {
                Logger.getLogger(VacuumCleaner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
