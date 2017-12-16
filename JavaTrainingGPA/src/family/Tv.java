/*
 * TV
 */
package family;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gheor
 */
public class Tv extends Thread{
    
    private Boolean isFavoriteShow = false;

    public Boolean getIsFavoriteShow() {
        return isFavoriteShow;
    }
    
    @Override
    public void run(){
        try {
            System.out.println("TV shows are boring...");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tv.class.getName()).log(Level.SEVERE, null, ex);
        }
        isFavoriteShow=true;
        System.out.println("TV show started!!!");
    }
    
    private void receiving(){
        while(true){     
        }
    }
}
