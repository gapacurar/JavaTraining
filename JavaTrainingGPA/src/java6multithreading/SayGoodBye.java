/*
 * Display Say Hello in console
 */
package java6multithreading;

/**
 *
 * @author gheor
 */
public class SayGoodBye extends Thread{
    
    @Override
    public void run() {
        System.out.println("Good bye!");
    }
}
