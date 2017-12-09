/*
 * Decrements a counter
 */
package java6multithreading;

/**
 *
 * @author gheor
 */
public class Scadere extends Thread{
    Counter c;
    
    public Scadere(Counter existingCounter){
        c = existingCounter;
    }
    
    @Override
    public void run(){
        for(int i=0;i<500;i++){
            c.decrement();
            System.out.println("c value is = " + c.value());
        }
    }    
}
