/*
 * A new thread class
 */
package multithreadingjava7;

/**
 *
 * @author gheor
 */
public class HelloWorld extends Thread{
    
    @Override
    public void run(){
        System.out.println("Hello world!");
    }
}
